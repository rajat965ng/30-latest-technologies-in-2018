package functions

object HigherOrderFunctions {

  def main(args: Array[String]): Unit = {
      times(println(apply(layout,100)))
  }

  def apply(f:Int => String, v:Int)= f(v)

  def layout[A](x:A) = "[ "+x.toString+" ]"

  def times[A](v: => A): Unit={
    v
  }

}
