package patternMatching

object PatternMatchDemo {

  def main(args: Array[String]): Unit = {
    println(matchMyInput(1))
    println(matchMyInput(10))
    println(matchMyInput(2))
    println(matchMyInput(11))

  }

  def matchMyInput(x:Int):String = x match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Ten"
  }

}
