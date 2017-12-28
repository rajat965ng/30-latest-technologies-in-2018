package collections

object SetsDemo {

  def main(args: Array[String]): Unit = {
    var set1 = Set()
    println(set1)
    println(set1.isEmpty)
    var set2 = Set(1,2,3,4,4)
    println(set2)
    println(set2.head)
    println(set2.tail)

    var set3 = Set(5,6,9,10,3);
    println(set3)

    var set4 = set2 ++ set3
    println(set4)
    set4 = set2.++(set3)
    println(set4)

    println(set4.min)
    println(set4.max)

    println(set2.&(set3))

    var emptyMap = Map()
    println(emptyMap)

    var colors = Map("red"->"#FF000","azure"->"#F0FFF")
    println(colors)
    colors += ("blue"->"#F0F0F")
    println(colors)
    println(colors.keys)
    println(colors.values)
    println(colors.isEmpty)

    var moreColor = Map("black"->"#FF000","white"->"#00000")
    moreColor = colors ++ moreColor
    println(moreColor)
    println(moreColor.head)
    println(moreColor.tail)
    println(moreColor.max)
    println(moreColor.min)
    println(moreColor.contains("black"))

    println(show(moreColor.get("black")))
    println(show(moreColor.get("orange")))


  }

  def show(x: Option[String])= x match{
    case Some(s) => s
    case None => "?"
  }

}
