import scala.util.control.Exception.catching


object CatchingDemo {

  def main(args: Array[String]): Unit = {

    val catchException = catching(classOf[ArithmeticException])
      .withApply(e=> println("Arithmatic Exception"))

    val a = catchException(10/0)

    if (a.!=()){
      println(a)
    }

  }

}
