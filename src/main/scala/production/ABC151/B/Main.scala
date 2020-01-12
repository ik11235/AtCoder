package production.ABC151.B

object Main extends App {
  val Array(n, k, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  if ((n * m) - a.sum <= k) {
    if ((n * m) - a.sum < 0) {
      println(0)
    }
    else {
      println((n * m) - a.sum)
    }
  } else {
    println("-1")
  }

}
