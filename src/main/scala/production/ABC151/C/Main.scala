package production.ABC151.C


object Main extends App {
  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var ACseq = Map.empty[Int, Int]
  var wacnt = Map.empty[Int, Int]

  (1 to m).foreach { i =>
   // println(ACseq)
   // println(wacnt)
    val Array(p, s) = scala.io.StdIn.readLine.split(" ")
    val pp = p.toInt

    if (!ACseq.isDefinedAt(pp)) {
      if (s == "AC") {
        val wacnt_tmp = wacnt.getOrElse(pp, 0)
        ACseq += (pp -> wacnt_tmp)
      } else {
        val wacnt_tmp = wacnt.getOrElse(pp, 0)
        wacnt += (pp -> (wacnt_tmp + 1))
      }
    }
  }
  println(ACseq.size + " " + ACseq.foldLeft(0)(_ + _._2))
}
