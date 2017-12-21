package protection

package society{
  package professional{

    class PackageProtection {

      private[professional] var workDetails = null;
      private[society] var friends = null;
      private[this] var secrets = null;

      def help(a:PackageProtection): Unit ={
        println(a.workDetails)
        println(a.friends)
      }

      def main(args: Array[String]): Unit = {
        println(this.secrets); //only accessible in main/instance method.
      }

    }

  }
}


