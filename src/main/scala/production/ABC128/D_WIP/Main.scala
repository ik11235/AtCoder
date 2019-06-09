package production.ABC128.D_WIP

object Main extends App {

  val Array(n, k) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val v = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var memo: Map[(Array[Int], Int), Int] = Map()

  def dphidari(vv: Array[Int], k: Int): Int = {
    if (k <= 0) {
      return 0
    } else {
      val bb = {
        if (vv.length > 0) {
          List(vv.last + dp(vv.take(1), k - 1),
            0)
        } else {
          List(0)
        }
      }.max

      val cc = {
        val take = v diff vv
        if (take.length > 0) {
          List(dphidari(take.min +: vv, k - 1) - take.min,
            0)
        } else {
          List(0)
        }
      }.max

      List(bb, cc, 0).max
    }

    def dpmigi(ints: Array[Int], i: Int): Int = {
      if (k <= 0) {
        return 0
      } else {
        val aa = {
          if (vv.length > 0) {
            List(vv.head + dp(vv.drop(1), k - 1),
              0)
          } else {
            List(0)
          }
        }.max

        val dd = {
          val take = v diff vv
          if (take.length > 0) {
            List(dpmigi(vv :+ take.min, k - 1) - take.min,
              0)
          } else {
            List(0)
          }
        }.max

        List(aa, dd, 0).max

      }
    }

    //toru 一度入れたらそっちからは取らない & 入れるときもそっちだけ
    def dp(vv: Array[Int], k: Int): Int = {
      if (k <= 0) {
        return 0
      } else {
        val aa = {
          if (vv.length > 0) {
            List(vv.head + dp(vv.drop(1), k - 1),
              0)
          } else {
            List(0)
          }
        }.max

        val bb = {
          if (vv.length > 0) {
            List(vv.last + dp(vv.take(1), k - 1),
              0)
          } else {
            List(0)
          }
        }.max

        val cc = {
          val take = v diff vv
          if (take.length > 0) {
            List(dphidari(take.min +: vv, k - 1) - take.min,
              0)
          } else {
            List(0)
          }
        }.max

        val dd = {
          val take = v diff vv
          if (take.length > 0) {
            List(dpmigi(vv :+ take.min, k - 1) - take.min,
              0)
          } else {
            List(0)
          }
        }.max

        List(aa, bb, cc, dd, 0).max
      }
    }

    /*
     def dp(vv: Array[Int], k: Int): Int = {
       //println(v.deep, k, have)
       val have = v diff vv

       if (k <= 0) {
         memo = memo + ((vv, k) -> 0)
         return 0
       } else if (memo.isDefinedAt((vv, k))) {
         return memo((vv, k))
       } else {
         if (vv.length == 0) {
           if (have.forall(_ < 0)) {
             (0 to k).foreach { i =>
               memo = memo + ((vv, i) -> 0)
             }
             return 0
           }
           else {
             val tmp = List(
               -have.min + dp(Array(have.min), k - 1),
               0
             ).max
             (0 to k).foreach { i =>
               memo = memo + ((vv, i) -> tmp)
             }
           }
         }
         if (have.isEmpty) {
           val tmp = List(
             vv(0) + dp(vv.tail, k - 1),
             vv.last + dp(vv.init, k - 1),
             0
           ).max
           (0 to k).foreach { i =>
             memo = memo + ((vv, i) -> tmp)
           }

         } else {
           val tmp = List(
             vv(0) + dp(vv.tail, k - 1),
             vv.last + dp(vv.init, k - 1),
             -have.min + dp(vv :+ have.min, k - 1),
             -have.min + dp(have.min +: v, k - 1),
             0
           ).max
           (0 to k).foreach { i =>
             memo = memo + ((vv, i) -> tmp)
           }
         }
       }
       memo((vv, k))
     }


     println(dp(v, k))

     */
    ???
  }
}