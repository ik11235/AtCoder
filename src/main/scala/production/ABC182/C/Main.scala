package production.ABC182.C

object Main extends App {
  val n = scala.io.StdIn.readLine
  var maps = Map.empty[String, Int]
  var min = 999999

  def exec(n: String, i: Int): Int = {
    if (maps.isDefinedAt(n)) {
      return maps(n)
    }
    if (min < i) {
      return -1
    }

    if (BigInt(n) % 3 == 0) {
      maps += n -> 0
      return 0
    } else if (n.length <= 1) {
      return -1
    }
    else {
      val tmp = (0 until n.length).map { ii =>
        val ss = n.take(ii) + n.substring(ii + 1)
        exec(ss, i + 1)
      }
      if (tmp.forall(_ == -1)) {
        maps += n -> -1
        return -1
      } else {
        val ans = (tmp.filterNot(_ == -1).min + 1)
        maps += n -> ans
        if (ans < min) {
          min = ans
        }
        return ans
      }
    }
  }

  // println(maps)
  println(exec(n, 0))
}
