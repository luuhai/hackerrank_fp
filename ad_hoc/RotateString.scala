object Solution {

  def main(args: Array[String]) {
    val num = readInt()
    for {
      i <- 1 to num
      s = readLine().trim()
    } {
        println(rotateString(s).mkString(" "))
      }
  }

  def rotateString(s: String): Seq[String] = {
    for {
      i <- 1 to s.length
      splitString = s.splitAt(i)
    } yield s"${splitString._2}${splitString._1}"
  }
}
