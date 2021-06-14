package demoTrait

class Rectangle2(var hight: Double, var width: Double)
  extends Polygon2 with Shapes {

    override def area(): Double = hight * width

    def color(): String = "Green"

  }
