import java.io.FileNotFoundException

object DemoExceptions {

  def main(args: Array[String]): Unit = {

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
