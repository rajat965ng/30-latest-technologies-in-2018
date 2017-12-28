package functions

object CurryingFunctionDemo {

  def main(args: Array[String]): Unit = {
    def strcat(s1:String)(s2:String) = s1+s2
    println(strcat("Hello")("Scala"))
  }

}
