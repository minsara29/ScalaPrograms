package journal

class Box(var width: Int, var height:Int, var depth: Int){

  def this()={
    this(1,1,1)
  }

  def this(w:Int, h: Int)={
    this(w,h,1)
  }

  def show()=println(s"width=$width, height= $height, depth= $depth")

}

object Constructors extends App{

  val b1 =new Box()
  b1.show()
  val b2 =new Box(5,5,5)
  b2.show()
  val b3 =new Box(2,2)
  b3.show()

}
