object Solution {

  def main(args: Array[String]) {
    val num = readInt()
    for {
      i <- 1 to num
      dataInfo = readLine().split(" ").map(x => x.toInt).toList
      data = readLine().split(" ").map(x => x.toInt).toList
      } {
        filterData(data, dataInfo(1)) match {
          case List() => println("-1")
          case result => println(result.mkString(" "))
        }
      }
  }

  def filterData(data: List[Int], min: Int): List[Int] = {
    val dataMap = data.groupBy(identity)
    data.filter(x => dataMap(x).length >= min).distinct
  }
}
