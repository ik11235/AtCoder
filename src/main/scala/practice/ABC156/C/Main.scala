package practice.ABC156.C

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val x = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted
  val x_max = x.last
  var ans = 99999999

  (0 to x_max).foreach { i =>
    val tmp = x.map { xx =>
      (xx - i) * (xx - i)
    }.sum

    ans = List(ans, tmp).min
  }
  println(ans)
}
