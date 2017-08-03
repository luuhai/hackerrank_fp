object Solution {

  def main(args: Array[String]) {
    val num = readInt()
    for {
      i <- 1 to num
      dataInfo = readLine().split(" ").map(x => x.toInt).toList
      data = readLine().split(" ").map(x => x.toInt).toList
      } {
        filterPrint(data, dataInfo(1))
      }
  }

  def filterPrint(data: List[Int], min: Int): Unit = {
    val dataMap = data.groupBy(identity)
    val filterData = data.filter(x => dataMap(x).length >= min)
    filterData match {
      case List() => print("-1")
      case _ => for (i <- filterData.distinct) print(s"$i ")
    }
    println
  }
}
