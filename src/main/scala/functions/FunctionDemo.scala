
object FunctionDemo{

  def time(): Long = {
    return System.nanoTime();
  }

  def delayed(t: => Long) = {
    println("The time is :"+t)
  }

  def main(args: Array[String]): Unit = {
    delayed(time())
  }

}