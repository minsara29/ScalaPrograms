import java.io.FileNotFoundException
import  java.io.FileReader

object ExceptionsDemo {

  def main(args: Array[String]): Unit = {

    try {
      val f = new FileReader("c:\\test.txt")
    }catch {
      case e : FileNotFoundException => {
        println("file not found")
      }case _ : Exception => {
        println("capture all Exception")
      }
    }


    val x = 5

    try {
      val results = x / 0
    }
    catch {
      case e: FileNotFoundException => println("Coulnt find the file"+ e)
      case e: ArithmeticException => println("Arithmetic Exception"+ e)
      case e: Throwable => println("other exception "+ e)
    }
    finally {
      println("I am from finally")
    }
  }


}

// handle the Exception in program
// or Throw the Exception to another program to handle it


object AnotherExample
{
  // Define function
  def validate(article:Int)=
  {
    // Using throw keyword
    if(article < 20)
      throw new ArithmeticException("You are not eligible for internship")
    else println("You are eligible for internship")
  }

  // Main method
  def main(args: Array[String])
  {
    validate(19)
  }
}
