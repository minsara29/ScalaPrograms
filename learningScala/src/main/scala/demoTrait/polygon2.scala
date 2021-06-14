package demoTrait

//Trait is equallent to java interface
//it allows to extend/inheritance from more than one class

trait Shapes{

  def color: String

}

class Polygon2 {

  def area: Double = 0.0
}

object Polygon2{
  def main(args: Array[String]): Unit = {

    var poly = new Polygon2()
    printArea(poly)

    var rec = new Rectangle2(10.0, 20.0)
    printArea(rec)
    println(rec.color())

    var tri = new Triangle2(10.0, 20.0)
    printArea(tri)
    println(tri.color())


  }

  def printArea(p: Polygon2) {
    println(p.area)

  }

}