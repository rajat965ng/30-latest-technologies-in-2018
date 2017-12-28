package functions

object NamedArgFunctionDemo {

  def main(args: Array[String]): Unit = {
    sum(b=7,a=8);
  }

  def sum(a:Int,b:Int) {
    println("a:"+a);
    println("b:"+b)
  }

}
