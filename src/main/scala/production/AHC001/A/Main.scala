package production.AHC001.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  var data: List[(Int, Int)] = List()
  var xlist: List[Int] = List()
  var ylist: List[Int] = List()

  (1 to n).foreach { _ =>
    val Array(x, y, r) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    data = data :+ ((x, y))
    xlist = xlist :+ x
    ylist = ylist :+ y
    //println(x + " " + y + " " + (x + 1) + " " + (y + 1))
  }
  xlist = xlist :+ 10001
  ylist = ylist :+ 10001

  xlist = xlist.sorted
  ylist = ylist.sorted

  data.foreach { dd =>
    //NEXT: 現在地よりも下にある中での最小を探す

    val x = dd._1
    val y = dd._2

    val xx = xlist.filter(_ > x).min - 1
    val yy = ylist.filter(_ > y).min - 1
    if ((x == xx) || (y == yy)) {
      println(x + " " + y + " " + (x + 1) + " " + (y + 1))
    } else {
      println(x + " " + y + " " + xx + " " + yy)
    }
  }
}
