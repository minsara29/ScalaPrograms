object ImplicitClassDemo {   //`implicit' modifier cannot be used for top-level objects
  // implicit class should be present in Object
  implicit class StringFunction(s: String) {

    def firstChar() = s.substring(0, 1)

    def chatAtIndex(i: Int) = s.substring(i, i + 1)

  }
}
import ImplicitClassDemo._ //should be imported before use

object ImplicitDemo {

  def main(args: Array[String]): Unit = {

    var string = "Kannan"
    println(string.firstChar())
    println(string.chatAtIndex(3))

  }


}
// if the class defined as final (java), cannot be extended/inherited
// some of class's sour code not available to modify

// but still you want to add some functionality to existing class
// fo example String class want to return first char of the string passed



