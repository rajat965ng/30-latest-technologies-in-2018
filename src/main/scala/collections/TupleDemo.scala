package collections

object TupleDemo {

  def main(args: Array[String]): Unit = {
    var t1 = (1,"HEllo",Console)
    println(t1)
    var t2 = new Tuple3(2,"World",Console)
    println(t2)
    val sum = t1._1+t2._1
    println(sum)
    t2.productIterator.foreach(println)
    println("Convert tuple to toString(): "+t2.toString())
    var swpTuple = new Tuple2("Hello","World")
    println("Swap the tuple: "+swpTuple.swap)

    var a:Option[Int] = Some(5)
    var b:Option[Int] = None

    println("a value:"+a.getOrElse(0))
    println("b value:"+b.getOrElse(10))

    println("a is empty:"+a.isEmpty)
    println("b is empty:"+b.isEmpty)

  }

}
