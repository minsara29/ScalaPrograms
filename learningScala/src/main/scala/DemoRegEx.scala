import scala.util.matching.Regex


object DemoRegEx {

  def main(args: Array[String]): Unit = {

    val pattern = new Regex("an")
    val pattern1 = "hl".r
    val pattern2 = "xyz".r

    println(pattern.findFirstIn("kannan"))
    println(pattern1 findFirstIn "Dahlia")
    println(pattern2 findFirstIn "abc")

    println(pattern2.findAllIn("abc xyz xyz").mkString(","))

    pattern2.findAllIn("abc xyz xyz").foreach(d=>print(d))
    println()
    var string = " Just want to 1 find the 10 number from this 200 string "

    var pattern3 = "[0-1]+".r

    println(pattern3.findAllIn(string).mkString(","))
    println(pattern3.findAllIn(string).toArray)

    val pattern4 = "(H|h)ello".r
    string = "Hello, i am not good .. yes hello"

    println(pattern4.findAllIn(string).mkString(","))
    string = "Hi there!"
    println(pattern4.findFirstIn(string).getOrElse(s"no matching word found in $string"))

  }

}

"""
  |
  |
  |""".stripMargin