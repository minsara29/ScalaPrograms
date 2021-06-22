import java.io.FileOutputStream
import java.io.ObjectOutputStream

import java.io.FileInputStream
import java.io.ObjectInputStream

@SerialVersionUID(15L) //use same version while de-serialize the data
case class Person(name: String) extends Serializable

object SerializeFileDataDemo extends App {

  val fileName = "data\\serialized.txt"

  val fos = new FileOutputStream(fileName)
  val oos = new ObjectOutputStream(fos)

  oos.writeObject(Person("Kannan"))
  oos.close()


  //deserialize the data

  val fis = new FileInputStream(fileName)
  val ois = new ObjectInputStream(fis)

  val person = ois.readObject
  ois.close()

  print(person)




}
