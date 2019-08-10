package production.ABC137.D_WIP

import scala.collection.mutable.ArrayBuffer


object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var emptyMap: scala.collection.mutable.Map[Int, ArrayBuffer[Int]] = scala.collection.mutable.Map.empty

  (0 until n).foreach { _ =>
    val Array(aa, bb) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    emptyMap.get(aa) match {
      case Some(_) => emptyMap(aa) += bb
      case None => emptyMap = emptyMap + (aa -> ArrayBuffer(bb))
    }
  }
  //  println(emptyMap)


  val sortmap = emptyMap.map { data =>
    (data._1 -> data._2.sorted.reverse)

  }
  println(sortmap)

  var nokoriday = m
  var ans = 0
  while (nokoriday > 0) {
    var kyoutasuku = nokoriday
    while (sortmap.get(kyoutasuku).isEmpty && kyoutasuku > 0) {
      kyoutasuku -= 1
    }

    if (kyoutasuku > 0) {
      //println(sortmap(kyoutasuku))
      ans += sortmap(kyoutasuku).remove(0)
      if (sortmap(kyoutasuku).isEmpty) {
        sortmap -= kyoutasuku
      }
    }
    nokoriday -= 1

  }

  println(ans)
}
