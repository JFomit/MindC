using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Toolchain.Compiler.Preprocessing.Wrappers
{
    internal abstract class TokenSourceWrapperBase : ITokenSource
    {
        protected ITokenSource Original { get; init; }
        public TokenSourceWrapperBase(ITokenSource original)
        {
            Original = original;
        }

        public int Line => Original.Line;
        public int Column => Original.Column;
        public ICharStream InputStream => Original.InputStream;
        public string SourceName => Original.SourceName;
        public ITokenFactory TokenFactory { get => Original.TokenFactory; set => Original.TokenFactory = value; }

        [return: NotNull]
        public abstract IToken NextToken();
    }
}
