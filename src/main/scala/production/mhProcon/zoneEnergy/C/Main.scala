package production.mhProcon.zoneEnergy.C

object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val connect = Array.ofDim[Boolean](n + 1, n + 1)
  (0 until m).foreach { _ =>
    val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    connect(a)(b) = true
    connect(b)(a) = true
  }
  var ansi = 0
  var ansj = 0
  var ansk = 0
  var cnt = 0

  def getList(i: Int): List[Int] = {
    var ans = List(i)
    println(connect(i).deep)
    connect(i).zipWithIndex.foreach { x =>
      if (x._1) {
        ans = ans :+ x._2
      }
    }


    ans
  }

  def exec(i: Int, j: Int, k: Int): Int = {
    def ii = getList(i)

    //println(ii)

    def jj = getList(j)

    //  println(jj)

    def kk = getList(k)

    //    println(kk)
    val uniq = (ii ++ jj ++ kk).distinct
    println(uniq)
    println(uniq.size)
    uniq.size
  }

  (0 until n - 2).foreach { i =>
    (i + 1 until n - 1).foreach { j =>
      (j + 1 until n).foreach { k =>
        println(i + " " + j + " " + k)

        val tmp = exec(i, j, k)
        if (tmp > cnt) {
          ansi = i
          ansj = j
          ansk = k
          cnt = tmp
        }
      }
    }
  }

  println(ansi + " " + ansj + " " + ansk)
  //println(connect.deep)
}
