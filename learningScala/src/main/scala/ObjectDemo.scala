object testObject{
  var x: Int = 2
  var y: Double = 5.5

  def add() = x + y

}

object demoObjects {

  def main(args: Array[String]): Unit = {
    println("Accessing Object Variable :" + TestObject.x)
    println("Accessing Object Variable :" + TestObject.add())
  }

}
