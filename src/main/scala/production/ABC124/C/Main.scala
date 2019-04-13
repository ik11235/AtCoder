package production.ABC124.C

object Main extends App {
  val s = scala.io.StdIn.readLine
  val count1 = s.zipWithIndex.count { tmp =>
    val aa = '0' + ((tmp._2 + 1) % 2)
    //    println(aa.toChar)
    //    println(tmp._1 != aa)

    tmp._1 != aa
  }
  //println()

  val count2 = s.zipWithIndex.count { tmp =>
    val aa = '0' + ((tmp._2 + 2) % 2)
    //    println(aa.toChar)
    //    println(tmp._1 != aa)

    tmp._1 != aa
  }
  //println(List(count1, count2))

  println(List(count1, count2).min)

}