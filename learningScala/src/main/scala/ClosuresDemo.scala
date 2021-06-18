/* a closure is function which uses one or more
variables declared outside the function */

object ClosuresDemo {

  var num = 10

  var add = (a:Int)  => a+num

  def main(args: Array[String]): Unit = {
    println(add(20))
  }
}
