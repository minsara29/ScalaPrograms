import scala.io._
object ConsoleReader extends App {

  val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

  val m = firstMultipleInput(0).toInt

  val n = firstMultipleInput(1).toInt

  println(m)
  println(n)


}
