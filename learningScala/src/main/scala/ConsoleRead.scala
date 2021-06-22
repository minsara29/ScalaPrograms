object ConsoleRead {

  def main(args: Array[String]): Unit = {

    println("Enter the Name : ")
    var name = scala.io.StdIn.readLine()
    println("Hello "+ name + "Welcome to this Demo")

    println("Enter the age : ")
    var age = scala.io.StdIn.readLine()
    println("you are "+ age + " old")



  }

}
