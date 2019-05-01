package practice.ABC004.C

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt

  var str = "123456"

  var nn = n

  while (nn > 30) {
    nn -= 30
  }

  while (nn > 5) {
    str = str.tail + str(0)
    nn -= 5
  }

  (0 to nn - 1).foreach { i =>
    val tmp = str(i % 5)
    str = str.patch(i % 5, str(i % 5 + 1).toString, 1)
    str = str.patch(i % 5 + 1, tmp.toString, 1)
  }

  println(str)
}