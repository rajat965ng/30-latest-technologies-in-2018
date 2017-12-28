package functions

object AddOps {

  def add(a:Int,b:Int) : Int = {
    return a+b;
  }

  def printMe():Unit = {
    println("Hello World ... I'm here !!")
  }

  def main(args: Array[String]): Unit = {
    println(add(3,4))
    printMe()
  }

}
