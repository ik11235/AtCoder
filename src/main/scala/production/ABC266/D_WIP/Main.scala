package production.ABC266.D_WIP

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val tx = Array.ofDim[Int](100001, 5)
  val timeList = new Array[Int](n)
  //var emptyMap: Map[(Int, Int), Long] = Map.empty
  var emptyMap: Map[Int, (Int, Long)] = Map.empty
  var tmax = 0
  //println(n)
  (0 until n).foreach { i =>
    val Array(t, x, a) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    tmax = t
    tx(t)(x) = a
    //emptyMap += (t -> (x, a))
    timeList(i) = t
  }

  var memo: Map[(Int, Int), Long] = Map.empty
  //println(emptyMap)

  val queue = new scala.collection.mutable.Queue[(Int, Int, Long)]
  var ans = 0.toLong
  queue.enqueue((0, 0, 0))
  while (queue.nonEmpty) {
    val qq = queue.dequeue()
    val x = qq._1
    val t_label = qq._2
    val sum = qq._3 + tx(timeList(t_label))(x)
    // println(x + "," + t + "," + sum)
    ans = Math.max(sum, ans)

    val f = memo.get((x, t_label)) match {
      case Some(v) =>
        (v < sum)
      case None =>
        false
    }
    if (!f && timeList(t_label) < tmax) {
      //次を取りに行くか


//      memo+=()
    }
  }
  println(ans)

  /*
    def exec(now: Int, time: Int): Long = {
      //  println("exec now: " + now + " time: " + time)
      if (time > tmax) {
        return 0
      }
      if (now < 0) {
        return 0
      }
      if (now > 4) {
        return 0
      }

      memo.get((now, time)) match {
        case Some(v) => v
        case None => {
          val nowadd = tx(time)(now)
          val af = List(exec(now - 1, time + 1), exec(now, time + 1), exec(now + 1, time + 1)).max
          val aaa = (af + nowadd)
          memo = memo + ((now, time) -> aaa)
          aaa
        }
      }
    }

    println(exec(0, 0))
   */


}
