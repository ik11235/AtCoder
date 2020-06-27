package production.ABC172.C_WIP


object Main extends App {
  /*
    import scala.collection.mutable

    val Array(n, m, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val s = scala.io.StdIn.readLine.split(" ").map(_.toInt)

    var memo = mutable.Set[(Int, Int)]()
    var max = 0
    var queue = new mutable.PriorityQueue[(BigInt, Int, Int)]()(Ordering.Tuple3[BigInt, Int, Int].reverse) // 消費時間,a,s

    queue.enqueue((0, -1, -1))

    while (queue.nonEmpty) {
      //  println(queue)
      val top = queue.dequeue()
      val time = top._1
      if (!memo((top._2, top._3))) {
        memo.add(top._2, top._3)
        max = List(max, top._2 + 1 + top._3 + 1).max

        if (top._2 < a.length - 1 && time + a(top._2 + 1) <= k) {
          queue.enqueue((time + a(top._2 + 1), top._2 + 1, top._3))
        }
        if (top._3 < s.length - 1 && time + s(top._3 + 1) <= k) {
          queue.enqueue((time + s(top._3 + 1), top._2, top._3 + 1))
        }
      }
    }

    println(max)
  */

  import scala.collection.mutable

  val Array(n, m, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val a = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var max = 0
  var queue = new mutable.Queue[(BigInt, Int, Int)]() // 消費時間,a,s
  var memo = Array.ofDim[Boolean](a.length + 2, s.length + 2)
  // println(memo.deep)

  queue.enqueue((0, 0, 0))

  while (queue.nonEmpty) {
    //  println(queue)
    val top = queue.dequeue()
    val time = top._1
    println(memo(top._2)(top._3))
    if (!memo(top._2)(top._3)) {
      memo(top._2)(top._3) = true
      max = List(max, top._2 + top._3).max

      if (top._2 < a.length && time + a(top._2) <= k) {
        queue.enqueue((time + a(top._2), top._2 + 1, top._3))
      }
      if (top._3 < s.length && time + s(top._3) <= k) {
        queue.enqueue((time + s(top._3), top._2, top._3 + 1))
      }
    }
  }

  println(max)

}
