object Solution {

  def main(args: Array[String]) {
    val p = readLine()
    val q = readLine()
    println(mingle(p.toList, q.toList).mkString)
  }

  def mingle(p: List[Char], q: List[Char]): List[Char] = {
    if (p.isEmpty) List()
    else p.head :: q.head :: mingle(p.tail, q.tail)
  }

}
