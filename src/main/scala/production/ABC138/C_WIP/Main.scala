package production.ABC138.C_WIP

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val v = scala.io.StdIn.readLine.split(" ").map(_.toInt).sorted

  var emptyMap: Map[scala.collection.mutable.ArrayBuffer[Int], Double] = Map.empty

  def exec(list: scala.collection.mutable.ArrayBuffer[Int]): Double = {
    emptyMap.get(list) match {
      case None =>
        if (list.size == 2) {
          val ans = (list.head + list.last) / 2.0
          emptyMap += (list -> ans)
          ans
        } else {
          var max = 0.0
          list.indices.foreach { i =>
            val tmpList = list.clone()

            val tmp = tmpList.remove(i)

            max = List((tmp + exec(tmpList)) / 2.0, max).max
          }

          emptyMap += (list -> max)
          max
        }
      case Some(data)
      => data
    }
  }

  val buf = collection.mutable.ArrayBuffer(v: _*)
  val ans = exec(buf)
  println(ans)
}