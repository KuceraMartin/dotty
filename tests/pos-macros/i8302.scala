import scala.quoted._
def foo[T](using Quotes, Type[T]): Expr[Any] =
  '{ (q: Quotes) ?=>
    type TT = T
    val t = Type.of[TT]
    ???
  }
