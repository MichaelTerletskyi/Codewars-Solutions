object Kata {

  // My solution
  def summation(n: Int): Int = {
    var sum: Int = 0
    for (i <- 1 to n) {
      sum += i
    }
    sum
  }

//  Best solution
//  def summation(n: Int): Int = (1 to n).sum
}