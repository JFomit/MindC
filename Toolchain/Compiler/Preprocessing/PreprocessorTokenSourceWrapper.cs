using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Toolchain.Compiler.Preprocessing
{
    internal class PreprocessorTokenSourceWrapper : ITokenSource
    {
        protected ITokenSource Previous { get; init; }
        protected Preprocessor Preprocessor { get; init; }

        public PreprocessorTokenSourceWrapper(Preprocessor preprocessor, ITokenSource  previous)
        {
            Preprocessor = preprocessor;
            Previous = previous;
        }

        public int Line => Previous.Line;
        public int Column => Previous.Column;
        public ICharStream InputStream => Previous.InputStream;
        public string SourceName => Previous.SourceName;
        public ITokenFactory TokenFactory { get => Previous.TokenFactory; set => Previous.TokenFactory = value; }

        [return: NotNull]
        public virtual IToken NextToken()
        {
            return Previous.NextToken();
        }
    }
}
