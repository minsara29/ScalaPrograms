object DemoImplicitClass {   //`implicit' modifier cannot be used for top-level objects
  // implicit class should be present in Object
  implicit class StringFunction(s: String) {

    def firstChar() = s.substring(0, 1)

    def chatAtIndex(i: Int) = s.substring(i, i + 1)

  }
}
import DemoImplicitClass._ //should be imported before use

object DemoImplicit {

  def main(args: Array[String]): Unit = {

    var string = "Kannan"
    println(string.firstChar())
    println(string.chatAtIndex(3))

  }


}
