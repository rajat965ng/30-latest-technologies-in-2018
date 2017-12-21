package inheritence

import location.Location


class Point(val cx:Int,  val cy:Int, val cz:Int)
  extends Location(cx,cy){

  var z = cz;

  def move(dx: Int, dy: Int, dz:Int): Unit ={
    super.move(dx,dy);
    z = z+dz;
    println("the value of z is "+z);
  }


}

object PointImpl{

  def main(args: Array[String]): Unit = {

    val point = new Point(3,4,6);
    point.move(4,5,6);

  }

}