package production.ABC099.C

object Main extends App {
  var memo = Array.fill[Int](100000)(999999)
  memo(0) = 0
  memo(1) = 1
  memo(2) = 2
  memo(3) = 3
  memo(4) = 4
  memo(5) = 5

  def getCount(n: Int, cnt: Int): Int = {
    if (memo(n) != 999999) {
      memo(n)
    } else {
      n match {
        case 0 =>
          0
        case 1 =>
          1
        case _ =>
          var nextList = List[Int]()
          var sixList = List(6)
          while (sixList.head <= n) {
            sixList +:= sixList.head * 6
          }
          sixList.foreach { six =>
            nextList :+= getCount(n - six, cnt + 1) + 1
          }


          var nineList = List(9)
          while (nineList.head <= n) {
            nineList +:= nineList.head * 9
          }
          nineList.foreach { nine =>
            nextList :+= getCount(n - nine, cnt + 1) + 1
          }

          nextList :+= getCount(n - 1, cnt + 1) + 1


          memo(n) = nextList.min
          memo(n)
      }
    }
  }

  val n = scala.io.StdIn.readLine.toInt

  println(getCount(n, 0))
}
