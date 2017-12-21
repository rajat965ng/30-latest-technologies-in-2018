package location

class Location(cx:Int, cy:Int) {

  var x = cx;
  var y = cy;


  def move(dx:Int, dy:Int): Unit ={
    x = x+dx;
    y = y+dy;
    println("the x location is "+x)
    println("the y location is "+y)

  }

}
