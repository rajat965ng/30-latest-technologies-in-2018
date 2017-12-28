package patternMatching

object AnyPatternDemo {

  def main(args: Array[String]): Unit = {
    println(matchAny(1))
    println(matchAny("two"))
    println(matchAny(4))
    println(matchAny(null))

  }

  def matchAny(x:Any):Any = x match {
    case 1 => "One"
    case "two" => 2
    case y:Int => "scala.Int"
    case _ => "many"
  }

}
