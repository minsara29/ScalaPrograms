object DemoStrings {

  def main(args: Array[String]): Unit ={

    var name: String = "Kannan"
    var paragraph: String =
      """
        |this is
        |multiline
        |String
        |""".stripMargin
    var lastName: String = "Tamilraj"
    println(name.charAt(1)) //to find char with the index
    println(name.equals(lastName))
    println(s"my name is $name and the lastName is $lastName")
    println(lastName.compareTo("tamilraj"))
    println(lastName.toLowerCase.compareTo("tamilraj"))
    println(matchPattern(1))
    println(matchPattern(10))
    println(matchPattern("one"))
  }

  def matchPattern(x: Any) = {
    x match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case "one" => 1
      case "two" => 2
      case "three" => 3
      case _ => "Unknown"
    }
  }

}
