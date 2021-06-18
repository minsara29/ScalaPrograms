// higher order function is take and return a function

object HigherOrderFunctionsDemo {

  def higher(x:Int, y:Int, f:(Int, Int)=>Int):Int = {
    f(x,y)
  }

  def add(a:Int, b:Int):Int = a+b

  def main(args: Array[String]): Unit = {

    println(higher(10, 20, add))

    //Anonymous function #equalent to lambda functions
    println(higher(10, 20, (a,b)=> a-b ))

    //another way of doing anonymous function

    println(higher(10, 20, _*_ ))

    println(higher(10, 20, _*_ ))

    println(higher(10, 20, _ max _ ))


    // partially applied functions

    val sum = (a:Int, b:Int, c:Int ) => a+b+c

    val f = sum(10, _:Int, _:Int) //partially applied

    println(f(20, 30))


  }

}
