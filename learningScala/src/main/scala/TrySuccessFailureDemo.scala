import scala.util.{Try, Success, Failure}

object TrySuccessFailureDemo {

  def main(args: Array[String]): Unit = {

    val a = Try(10 / 0)

    a match {
      case Success(value) => println(value)
      case Failure(exception) => println(exception)
      //case Failure(exception) => errorHandling(exception)
    }

  }

  // if want to handle specific error then wrtite function

  def errorHandling(e: Throwable) = {
    if (e.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("error handled in functions")

    }
  }
}