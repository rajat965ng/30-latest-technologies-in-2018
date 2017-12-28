package extractors

object ExtractorDemo {

  def main(args: Array[String]): Unit = {
    println(apply("rajatnigam89","gmail.com"))
    println(unapply("rajat_965ng@youthunited.in"))
  }

  def apply(username:String,mail:String): String ={
    username+"@"+mail
  }

  def unapply(email:String):Option[(String,String)] = {
    var arr = email.split("@")
    if(arr.length==2){
      Some(arr(0),arr(1))
    }else{
      None
    }
  }

}
