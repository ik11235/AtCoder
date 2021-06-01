package production.mhProcon.zoneEnergy.A

object Main extends App {

  def rot13(ch: Char): Char = {
    val next = ch.toInt + 13
    if (next > 'z'.toInt) {
      (next - 26).toChar
    } else {
      next.toChar
    }
  }

  for (line <- io.Source.stdin.getLines()) {
    println(line.map(rot13))
  }
}
