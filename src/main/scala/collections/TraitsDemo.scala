package collections

object TraitsDemo {

  def main(args: Array[String]): Unit = {
    var p1 = new Point(2,3)
    var p2 = new Point(3,4)
    var p3 = new Point(2,3)
    println(p1.isEqual(p2))
    println(p1.isEqual(p3))
    println(p1.isNotEqual(p2))
  }

}

trait MyEqual{
  def isEqual(x:Any): Boolean
  def isNotEqual(x:Any): Boolean = !isEqual(x)
}

class Point(a:Int,b:Int) extends MyEqual {

  var ax = a;
  var bx = b;

  override def isEqual(x: Any):Boolean = {
   return x.isInstanceOf[Point] &&
     x.asInstanceOf[Point].ax == ax &&
     x.asInstanceOf[Point].bx == bx

  }
}