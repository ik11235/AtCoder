package production.ABC266.C

object Main extends App {

  def kakudo(prot1: (Int, Int), prot2: (Int, Int), prot3: (Int, Int)): Double = {
    val ba = new Array[Int](2)
    ba(0) = prot1._1 - prot2._1
    ba(1) = prot1._2 - prot2._2
    val bc = new Array[Int](2)
    bc(0) = prot3._1 - prot2._1
    bc(1) = prot3._2 - prot2._2

    val babc = ba(0) * bc(0) + ba(1) * bc(1)
    val ban = (ba(0) * ba(0)) + (ba(1) * ba(1))
    val bcn = (bc(0) * bc(0)) + (bc(1) * bc(1))
    val radian = Math.acos(babc / Math.sqrt(ban * bcn))
    return radian * 180 / Math.PI // 結果（ラジアンから角度に変換）
  }

  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val aa = (a(0), a(1))
  val b = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val bb = (b(0), b(1))
  val c = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val cc = (c(0), c(1))
  val d = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val dd = (d(0), d(1))

  val abc = kakudo(aa, bb, cc)
  val bcd = kakudo(bb, cc, dd)
  val cda = kakudo(cc, dd, aa)
  val dab = kakudo(dd, aa, bb)
  //println(abc)
  //println(bcd)
  //println(cda)
  //println(dab)

  val ans = (abc + +bcd + cda + dab)
  if (ans - 360.0 < 0.1 && ans - 360.0 > -0.1) {
    println("Yes")
  } else {
    println("No")

  }
}
