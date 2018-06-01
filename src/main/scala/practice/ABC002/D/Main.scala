package practice.ABC002.D

object Main extends App {
  def printArBL(array: Array[Boolean]): Unit = {
    println(
      array
        .map(i =>
          if (i) {
            'T'
          } else {
            'F'
        })
        .mkString(""))
  }

  def printAr(manLink: Array[Array[Boolean]]): Unit = {
    manLink.foreach(printArBL)
  }

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var manLink = Array.fill[Boolean](n, n)(false)
  (0 until n).foreach { i =>
    manLink(i)(i) = true
  }
  var ans = 0

  (1 to m).foreach { i =>
    val Array(x, y) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    manLink(x - 1)(y - 1) = true
    manLink(y - 1)(x - 1) = true
  }

  def check(flagArray: Array[Boolean],
            manLink: Array[Array[Boolean]]): Boolean = {
    flagArray.indices.foreach { i =>
      if (flagArray(i)) {
        flagArray.indices.foreach { j =>
          if (flagArray(j)) {
            if (!manLink(i)(j)) {
              return false
            }
          }
        }
      }
    }

    true
  }

  (0 to n).foreach { i =>
    val a = Array.fill[Boolean](i)(true) ++ Array.fill[Boolean](n - i)(false)
    a.permutations.foreach { flagArray =>
      if (check(flagArray, manLink)) {
        //printArBL(flagArray)
        ans = a.count(_ == true)
      }
    }
  }

  println(ans)
  //  printAr(manLink)
}
