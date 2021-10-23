object Kata {
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    if (integers.isEmpty) Tuple2(0, 0) else Tuple2(integers.count(d => d > 0), integers.filter(d => d < 0).sum)
  }
}