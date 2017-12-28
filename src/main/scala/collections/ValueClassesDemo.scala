package collections

object ValueClassesDemo {

  def main(args: Array[String]): Unit = {
    var w = new A(5)
    w.print()
  }

}


class A(val x:Int) extends AnyVal with Printable

trait Printable extends Any{
  def print(): Unit =  println(this)

}
