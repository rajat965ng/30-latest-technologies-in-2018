package closures

object HelloClosure {

  def main(args: Array[String]): Unit = {
    println(helloWorld("Hello"))
    println(helloWorld("Scala"))

  }

  val msg = "World"
  var helloWorld = (str:String) => str+" "+msg;

}
