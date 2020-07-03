package practice.abc157.B

object Main extends App {
  val a = (1 to 3).map { _ =>
    scala.io.StdIn.readLine.split(" ").map(_.toInt)
  }
  val aa = Array.ofDim[Boolean](3, 3)

  val n = scala.io.StdIn.readLine.toInt
  (0 until n).foreach { _ =>
    val b = scala.io.StdIn.readLine.toInt
    (0 to 2).foreach { i =>
      (0 to 2).foreach { j =>
        if (a(i)(j) == b) {
          aa(i)(j) = true
        }
      }
    }
  }

  if (aa(0).forall(_ == true) || aa(1).forall(_ == true) || aa(2).forall(_ == true) ||
    (aa(0)(0) && aa(1)(0) && aa(2)(0)) ||
    (aa(0)(1) && aa(1)(1) && aa(2)(1)) ||
    (aa(0)(2) && aa(1)(2) && aa(2)(2)) ||
    (aa(0)(0) && aa(1)(1) && aa(2)(2)) ||
    (aa(2)(0) && aa(1)(1) && aa(0)(2))) {
    println("Yes")
  } else {
    println("No")
  }

}
