object HelloWorld {

  def main(args: Array[String]): Unit = {
    var myString: String = "Rajat Nigam";
    val myVal: String = "Rock the dragon";

    myString = myString.concat("ok");

    println(myString+" "+myVal);
  }

}
