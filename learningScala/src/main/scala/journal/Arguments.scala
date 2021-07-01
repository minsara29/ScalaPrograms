package journal



object Arguments extends App {

  //packed arguments in python
  //all values must be same data types
  // all values are packed into an array
  def echo(s: String*) = s.foreach(println)

  echo("one", "two", "three")

  //named arguments - keyword arguments
  def doSomething(f:(String)=>String, s:String) = f(s)

  val rst = doSomething(f= (x=>"[" +x+ "]"), s="Kannan") //named arguments
  println(rst)

  //default Arguments

  def doSomething1(f:(String)=> Unit =println, s:String) = f(s)

  doSomething1(s="hello there")

}
