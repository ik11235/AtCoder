package production.ABC124.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val h = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val ans = h.toList.zipWithIndex.count { tmp =>
    val subh = h.slice(0, tmp._2)
    //println(tmp)
    //println(subh.deep)
    //println(subh.toList.forall(_ >= tmp._1))

    subh.toList.forall(_ <= tmp._1)
  }

  println(ans)
}
