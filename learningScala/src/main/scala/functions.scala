object functions {

  def main(args: Array[String]): Unit = {
    println("Testing simple functions")

    var result = add_method(2, 10)
    println("result = " + result )
    println("calling method results = "+ add_method(25, 3))

    println("calling method of sub results = "+ sub_method(25, 3))
  }

  def add_method (a: Int, b: Int): Float ={
    return a+b
  }

  def sub_method (a: Int, b: Int): Float ={
    a - b
  }
}
