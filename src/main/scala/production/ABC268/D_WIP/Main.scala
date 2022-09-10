package production.ABC268.D_WIP


object Main extends App {

  import scala.collection.immutable

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = (1 to n).map(_ => scala.io.StdIn.readLine)
  val t = (1 to m).map(_ => scala.io.StdIn.readLine).toSet

  val ss = s.permutations.toSet
  val bar_use = 16 - s.mkString("").length

  def checkAndPrintAns(str: String): Unit = {
    if (!t.contains(str) && str.length >= 3 && str.length <= 16) {
      println(str)
      sys.exit(0)
    }
  }

  def countUpArr(arr: Array[Int], maxsize: Int): Array[Int] = {
    var newArr = arr
    newArr(newArr.length - 1) = newArr.last + 1
    newArr.indices.reverse.foreach { i =>
      if (newArr(i) > maxsize) {
        if (i - 1 < 0) {
          return Array.empty
        }
        newArr(i - 1) += 1
        newArr(i) = 1
      }
    }

    return newArr
  }

  def createCntArray(arraySize: Int, maxsize: Int): Set[Array[Int]] = {
    var res = Set(Array.fill[Int](arraySize)(1))
    var nowArr = Array.fill[Int](arraySize)(1)
    while (nowArr.sum < maxsize) {
      nowArr = countUpArr(nowArr, maxsize)
      if (nowArr.isEmpty) {
        return res
      }

      res ++= nowArr.permutations.toSet
      //println(nowArr.deep)
    }

    return res
  }

  def createStr(str: immutable.IndexedSeq[String], aa: Array[Int]): Unit = {
    var strjoin = ""

    if (aa.contains(0)) {
      return
    }
    aa.indices.foreach { i =>
      strjoin += str(i) + ("_" * aa(i))
    }

    strjoin += str.last
    checkAndPrintAns(strjoin)
  }

  if (s.size == 1) {
    checkAndPrintAns(s.head)
  } else {
    ss.foreach {
      str =>
        val aaa = createCntArray(str.size - 1, bar_use)
        aaa.foreach {
          aaaa =>
            createStr(str, aaaa)
        }
    }
  }

  println("-1")
}
