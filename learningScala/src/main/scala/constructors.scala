class Values(a: Int = 4, b: Double = 7.6, c: String= "Hi"){
  var x: Int = a
  var y: Double = b
  var z: String = c

  println(s"<Values> x=${x}, y=${y}, z=${z}")
}

class Value1(a: Int, b: Double, c: String){
  var x: Int = a
  var y: Double = b
  var z: String = c

  def this(){
    this(0, 0.0, "Default")
  }

  def this(a: Int){
    this(a, 0.0, "Default")
  }

  def this(a: Int, b: Double){
    this(a, b, "Default")
  }

  println(s"<Value1> x=${x}, y=${y}, z=${z}")
}

object constructors {

  def main(args: Array[String])={
    var v = new Values()
    var v1 = new Value1(1, 2.2, "Kannan")
    var v2 = new Value1()
    var v3 = new Value1(3)
    var v4 = new Value1(4, 4.4)
  }
}
