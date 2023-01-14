using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MindC.Compiler;
using MindC.Toolchain.Compiler.Preprocessing.Wrappers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Toolchain.Compiler.Preprocessing
{
    internal class Preprocessor : ITokenSource
    {
        private ITokenSource TopLevelSource { get; set; }

        public int Line => TopLevelSource.Line;
        public int Column => TopLevelSource.Column;
        public ICharStream InputStream => TopLevelSource.InputStream;
        public string SourceName => TopLevelSource.SourceName;
        public ITokenFactory TokenFactory { get => TopLevelSource.TokenFactory; set => TopLevelSource.TokenFactory = value; }

        public HashSet<string> DefinedConsts { get; init; }

        public Preprocessor(ITokenSource lexer)
        {
            TopLevelSource = lexer;
            DefinedConsts = new();
        }

        [return: NotNull]
        public IToken NextToken()
        {
            var next = TopLevelSource.NextToken();

            if (next.Type == MindCLexer.INCLUDE)
            {
                var path = TopLevelSource.NextToken();
                string fileToInclude;
                using (var stream = new StreamReader(path.Text.Trim('"')))
                {
                    fileToInclude = stream.ReadToEnd();
                }
                AntlrInputStream inputStream = new(fileToInclude);
                MindCLexer lexer = new(inputStream);

                TopLevelSource = TopLevelSource.Include(lexer);

                return this.NextToken();
            }

            if (next.Type == MindCLexer.DEF)
            {
                var flag = TopLevelSource.NextToken().Text;
                DefinedConsts.Add(flag);

                return this.NextToken();
            }
            if (next.Type == MindCLexer.UNDEF)
            {
                var flag = TopLevelSource.NextToken().Text;
                DefinedConsts.Remove(flag);

                return this.NextToken();
            }

            if (next.Type == MindCLexer.IFDEF)
            {
                var flag = TopLevelSource.NextToken().Text;
                if (!DefinedConsts.Contains(flag))
                {
                    TopLevelSource = TopLevelSource.SkipWhile(t => t.Type is not MindCLexer.ENDIF and not MindCLexer.Eof);
                }

                return this.NextToken();
            }
            if (next.Type == MindCLexer.IFNDEF)
            {
                var flag = TopLevelSource.NextToken().Text;
                if (DefinedConsts.Contains(flag))
                {
                    TopLevelSource = TopLevelSource.SkipWhile(t => t.Type is not MindCLexer.ENDIF and not MindCLexer.Eof);
                }

                return this.NextToken();
            }
            if (next.Type == MindCLexer.ENDIF)
            {
                return this.NextToken();
            }

            return next;
        }
    }
}
