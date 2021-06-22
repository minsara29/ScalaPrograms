object FirstClassFunctionsDemo {

  def main(args: Array[String]): Unit = {

    val add : (Int, Int) =>Int =  (a:Int, b:Int) => a + b //declaring function type
//    val add =  (a:Int, b:Int) => a + b
    val multiply = (a:Int, b:Int) => a * b


    println(mathFunction(2, 3, add))
    println(mathFunction(2, 3, multiply))

  }

  def mathFunction(a: Int,b:Int , f:(Int, Int)=>Int) = f(a,b) //Mandatory to declare the type

//  def example(a:Int): Int ={ //default is val
//    a = a+1 // cannot be re-assinged values .. same in methods too
//
//  }

}
