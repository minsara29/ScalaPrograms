package demoTrait

class Triangle2(var hight: Double, var width: Double)
  extends Polygon2 with Shapes {

  override def area(): Double = hight * width / 2

  def color(): String = "Red"

}
