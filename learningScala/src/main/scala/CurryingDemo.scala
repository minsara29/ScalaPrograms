/*
currying is the technique of transforming a function
that takes multiple arguments into a function
that takes a single argument
*/

object CurryingDemo {

  def add(a:Int, b:Int):Int = a+b

  def add2(x:Int) = (y:Int) => x+y

  def add3(x:Int) (y:Int) = x+y //simpler format of above

  def main(args: Array[String]): Unit = {
    println(add(1,2))

    println(add2(10)(20))

    val sum40 = add2(40)
    println(sum40(100))

    println(add3(100)(300))

    val sum300 = add3(300)_ //pass the other parameter later

    println(sum300(10))
  }
}
