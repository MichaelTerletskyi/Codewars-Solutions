object Kata {

  // My Solution
  def countingSheep(num: Int): String = {
    var res: String = ""
    for (i <- 1 to num) {
      res += s"$i sheep..."
    }
    res
  }

  // Best Solution
  // def countingSheep(n: Int): String = (1 to n).map(i => s"$i sheep...").mkString
}