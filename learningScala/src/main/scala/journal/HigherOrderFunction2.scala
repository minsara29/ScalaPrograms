package journal

//return a function

object HigherOrderFunction2 extends App{

  //partially applied functions

  def greetSome(x:String) = {
    def f(y: String) = x +" "+ y
    f _ //partially applied function
  }

  def greatSomeOne(x:String) = {
    (y: String) => x +" "+ y
  }

  def f1 (x: Int) ={
    println("Sqrt of "+x+ " is: " + Math.sqrt(x))
    (y:Double) => x + y
  }

  val f2 = (x: Int) =>  (y:Double) => x + y


  val hiSomeOne = greatSomeOne("Hello")

  println(hiSomeOne("Kannan"))

  println(greatSomeOne("Hmmm...")("Its Curring function"))

  val anotherOne = greetSome("Hi")

  println(anotherOne("Dahlia"))

  val add5 = f1(5)
  println(add5(10))

  println(f1(3)(5))

  val fs: String => (String => String) = (prefix: String) => (s: String) => prefix + " " + s
  val fss = (prefix: String) => (s: String) => prefix + " " + s
  val fsss = (prefix: String) => { (s: String) => prefix + " " + s }

  println(fs("hi")("there"))
  println(fss("hi")("there again"))

}

