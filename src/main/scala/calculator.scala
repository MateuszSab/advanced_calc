import scala.io.StdIn.readLine
import scala.sys.exit

object calculator extends App {
  val calculator = new NewCalc

  while (true) {
    val x = readLine("Podaj x: ").toInt
    val y = readLine("Podaj y: ").toInt

    var z = readLine("Podaj operator: (+, -, *, /): ")
    while (!calculator.isOperatorValid(z)) {
      println(s"ERROR: unknown operator: $z")
      z = readLine("Podaj operator: (+, -, *, /): ")

    }
    println(calculator.compute(x, y, z))

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Dizienki")

      exit()
    }
  }




}