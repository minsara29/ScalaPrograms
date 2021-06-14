package demoAbstract

class Rectangle1(var hight: Double, var width: Double) extends Polygon1{

  override def area(): Double = hight * width

  }
