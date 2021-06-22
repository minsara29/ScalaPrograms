import scala.io.StdIn._

object UserInputDemo {

  def main(args: Array[String]): Unit = {

    print("enter the name : ")
//    var input = scala.io.StdIn.readLine()
    var input = readLine()

    printf("you have entered : " + input)

  }

}
