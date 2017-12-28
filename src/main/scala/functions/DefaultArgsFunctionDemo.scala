package functions

object DefaultArgsFunctionDemo {

  def main(args: Array[String]): Unit = {
    println(sum())
    println(sum(6,9))
  }

  def sum(a:Int=5,b:Int=7):Int = {
    return a+b;
  }
}

