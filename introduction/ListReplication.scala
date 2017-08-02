def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x => for (i <- 1 to num) yield x)
