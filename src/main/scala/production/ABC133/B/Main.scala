package production.ABC133.B

object Main extends App {

  import scala.math._

  val Array(n, d) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val x = (1 to n).map { i =>
    scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
  }

  var ans = 0
  (0 until n - 1).foreach { i =>
    (i + 1 until n).foreach { j =>
      val sum = (0 until d).map { k =>
        //println(x(i)(k) + " " + x(j)(k))
        Math.pow(abs(x(i)(k) - x(j)(k)), 2)
      }.sum
    //  println(sum)
      val sq = sqrt(sum).toInt
      if (sq * sq == sum) {
        ans += 1
      }
    }
  }

  println(ans)
}
