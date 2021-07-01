package journal

// take a function as an argument

object HigherOrderFunction1 extends App{

  def intDecorator(x: Int, f:(Int)=>String) ={
    f(x)
  }

  def sumX(x: Int, y: Int, f:(Int, Int)=>Double) ={
    f(x,y)
  }

  val result = intDecorator(5, (y=> "["+y+"]"))
  println(result)


  val result1 = intDecorator(5, (y=> "<b>"+y+"</b>"))
  println(result1)

  val cube = sumX(5,3, (x,y)=> x*x*x + y*y*y)
  println(cube)


}
