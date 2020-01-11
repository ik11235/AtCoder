package production.ABC150.D_WIP

object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val aa = a.distinct
  if (aa.forall(aa => aa % 2 == 0)) {
    var aaa = aa(0) / 2
    var aalist = List[Int]()
    while (aaa <= m) {
      // println(aaa)
      aalist :+= aaa.toInt
      aaa += a(0)
      //      println(aaa)
    }
   // println(aalist)
    aa.tail.foreach { tmpa =>
      // println("tempa=" + tmpa)

      aalist = aalist.filter { tmpaa =>
        //println("tmpaa=" + tmpaa)
        //println((tmpaa.toFloat / tmpa))
        (tmpaa.toFloat / tmpa) * 10 % 10 == 5
      }
    }
    println(aalist.length)
  } else {
    println(0)
  }

}
