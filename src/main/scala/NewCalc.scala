import scala.io.StdIn.readLine
import scala.sys.exit

class NewCalc {

  def compute(x: Integer, y: Integer, z: String): Int = {

//    var result: Int = 0
    if (z == "+") {
      x + y
    } else if (z == "-") {
      x - y
    } else if (z == "*") {
      x * y
    } else x/y
//    } else if (z == "/") {
//      if (y == 0)
//        println("Error. Nie dziel przez 0")
//      x / y
//    } else {
//      println(s"ERROR: unknown operator: $z")
//    }

  }
   def isOperatorValid(z: String): Boolean = {
    (z == "+" || z == "/" || z == "*" || z == "-")
  }
}
