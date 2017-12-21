package singleton

class Point(val xc:Int,val yc:Int) {
  var x = xc;
  var y = yc;

  def move(dx:Int, dy:Int){
    x = x+dx;
    y = y+dy;
  }
}

object Demo{

  def main(args: Array[String]): Unit = {

    val point = new Point(10,20);
    val point1 = new Point(20,30)

    printPoint


    def printPoint: Unit ={
      println("x:"+point.x)
      println("Y:"+point.y)
    }
  }

}