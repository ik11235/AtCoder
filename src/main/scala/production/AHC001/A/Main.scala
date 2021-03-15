package production.AHC001.A

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  var data: List[(Int, Int)] = List()

  (1 to n).foreach { _ =>
    val Array(x, y, r) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    data = data :+ ((x, y))
  }


  data.foreach { dd =>
    //現在地よりも下にある中での最小を探す
// NEXT: 右下方向にある最短の点まで伸ばす(一定方向にしないと交差しそう) ダメなきもする

    val x = dd._1
    val y = dd._2

    val migi = data.filter(xx => xx._1 > x && xx._2 > y)

    val xx = {
      if (migi.isEmpty) {
        10000
      } else {
        migi.map(_._1).filter(_ > x).min - 1
      }
    }

    val yy = {
      if (migi.isEmpty) {
        10000
      } else {
        migi.map(_._2).filter(_ > y).min - 1
      }
    }

    if ((x == xx) || (y == yy)) {
      println(x + " " + y + " " + (x + 1) + " " + (y + 1))
    } else {
      println(x + " " + y + " " + xx + " " + yy)
    }
  }
}

