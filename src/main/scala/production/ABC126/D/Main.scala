package production.ABC126.D

object Main extends App {
  private[this] val n = scala.io.StdIn.readLine.toInt
  private[this] var color = scala.Array.fill[Int](n)(-1)
  private[this] var maps = Array.fill(n)(List.empty[(Int, Int)])
  (0 until n - 1).foreach { _ =>
    val Array(u, v, w) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val uu = u - 1
    val vv = v - 1
    maps(uu) = (vv, w) :: maps(uu)
    maps(vv) = (uu, w) :: maps(vv)
  }

  private[this] val queue = new scala.collection.mutable.Queue[(Int, Boolean)]

  queue += ((0, true))

  while (queue.nonEmpty) {
    val (n, now_color) = queue.dequeue()
    if (color(n) == -1) {
      if (now_color) {
        color(n) = 0
      } else {
        color(n) = 1
      }

      maps(n).foreach { next =>
        val nextPoint = next._1
        val nextLen = next._2
        nextLen % 2 == 0 match {
          case true =>
            queue += ((nextPoint, now_color))
          case false if now_color =>
            queue += ((nextPoint, false))
          case _ =>
            queue += ((nextPoint, true))
        }
      }
    }
  }

  color.foreach(println)
}


/*
  def Search(n: Int, now_color: Boolean): Unit = {
    if (color(n) != -1) {
      return
    }

    if (now_color) {
      color(n) = 0
    } else {
      color(n) = 1
    }

    maps(n).foreach { next =>
      val nextPoint = next._1
      val nextLen = next._2
      nextLen % 2 == 0 match {
        case true =>
          Search(nextPoint, now_color)
        case false if now_color =>
          Search(nextPoint, false)
        case _ =>
          Search(nextPoint, true)
      }
    }
  }
  Search(0, true)

 */
