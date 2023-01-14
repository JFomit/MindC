using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MindC.Compiler;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MindC.Toolchain.Compiler.Preprocessing.Wrappers
{
    internal static class ITokenSourceWrappers
    {
        public static ITokenSource Include(this ITokenSource tokenSource, ITokenSource fileToInclude)
        {
            return new IncludeTokenSourceWrapper(fileToInclude, tokenSource);
        }
        /// <summary>
        /// 
        /// </summary>
        /// <param name="tokenSource"></param>
        /// <param name="condition"></param>
        /// <returns></returns>
        public static ITokenSource SkipWhile(this ITokenSource tokenSource, Predicate<IToken> condition)
        {
            return new SkipUntilConditionTokenSourceWrapper(tokenSource, condition);
        }

        private class IncludeTokenSourceWrapper : TokenSourceWrapperBase
        {
            private bool IsSecond { get; set; }
            private ITokenSource First { get; init; }
            private ITokenSource Second => Original;

            internal IncludeTokenSourceWrapper(ITokenSource first, ITokenSource second) : base(second)
            {
                IsSecond = false;
                First = first;
            }

            [return: NotNull]
            public override IToken NextToken()
            {
                if (IsSecond)
                {
                    return Second.NextToken();
                }
                else
                {
                    var next = First.NextToken();
                    if (next.Type == MindCLexer.Eof)
                    {
                        IsSecond = true;
                        return Second.NextToken();
                    }

                    return next;
                }
            }
        }
        private class SkipUntilConditionTokenSourceWrapper : TokenSourceWrapperBase
        {
            private bool IsActive { get; set; }
            private Predicate<IToken> Condition { get; init; }

            public SkipUntilConditionTokenSourceWrapper(ITokenSource original, Predicate<IToken> condition) : base(original)
            {
                IsActive = true;
                Condition = condition;
            }

            [return: NotNull]
            public override IToken NextToken()
            {
                var next = Original.NextToken();

                if (IsActive)
                {
                    var cond = Condition.Invoke(next);
                    while (cond)
                    {
                        next = Original.NextToken();
                        cond = Condition.Invoke(next);
                    }
                    IsActive = false;
                    return Original.NextToken();
                    //if (Condition.Invoke(next))
                    //{
                    //    IsActive = false;
                    //    return Original.NextToken();
                    //}
                    //if (next.Type == MindCLexer.Eof)
                    //{
                    //    IsActive = false;
                    //    return Original.NextToken();
                    //}

                    //return this.NextToken();
                }

                return next;
            }
        }
    }
}
