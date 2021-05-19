//class and Object name are same
// variables and methods are accessible from class/objects

class demoCompanion{
  var x = 5.2

  def multiply(): Unit ={
    println(s"the value of multiply ${x * demoCompanion.y}")
    demoCompanion.y = 20
    println(s"the value of multiply ${x * demoCompanion.y}")
  }
}

object demoCompanion {
  var y:Int = 10

  def display(x: Double): Unit ={
    println(s"values x= ${x} and y= ${y}")
  }

  def main(args: Array[String]): Unit ={
    var obj = new demoCompanion()
    obj.multiply()
    display(obj.x)

  }

}
