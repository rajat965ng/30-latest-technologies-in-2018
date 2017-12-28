package FileIO

import java.io.FileReader

object FileIODemo {

  def main(args: Array[String]): Unit = {

    var home = System.getProperty("user.dir");

    var reader = new FileReader(home+"/src/main/resources/"+"Input.txt")
    var c:Int = 0

    while(c!= -1){
      c = reader.read()
      print(c.asInstanceOf[Char])
    }

  }



}
