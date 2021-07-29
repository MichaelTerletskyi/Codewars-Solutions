object Kata {

  // My Solution
  def grow(xs: List[Long]): Long = {
    var sum: Long = xs(0)
    for (i <- 1 until xs.length) {
      sum *= xs(i)
    }
    sum
  }

  // Best Solution
  // def grow(xs: List[Long]): Long = xs.product
}