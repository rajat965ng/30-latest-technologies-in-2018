package strings

object SInterpolationDemo {

  def main(args: Array[String]): Unit = {
    var name = "Rajat"
    println(s"Hello $name")
    println(s"1 + 1 = ${1+1}")
  }

}
