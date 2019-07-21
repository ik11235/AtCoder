package production.ABC134.C

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val a = (1 to n).map { _ =>
    scala.io.StdIn.readLine.toInt
  }
  val aa = a.sorted.reverse
  val max01 = aa.head
  val max02 = aa(1)
  a.foreach { aaa =>
    if (aaa == max01) {
      println(max02)
    } else {
      println(max01)
    }
  }
}