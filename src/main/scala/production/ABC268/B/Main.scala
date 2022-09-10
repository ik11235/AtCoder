package production.ABC268.B

object Main extends App {
  val s = scala.io.StdIn.readLine
  val t = scala.io.StdIn.readLine

  if(t.startsWith(s)) {
    println("Yes")
  } else {
    println("No")
  }
}