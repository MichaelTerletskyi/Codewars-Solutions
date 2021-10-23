object Kata {

  // My Solution
  def points(games: Vector[String]): Int = {
    var sum: Int = 0
    games.foreach(s => {
      val strings = s.split(":")
      if (strings(0).toInt > strings(1).toInt) sum += 3
      if (strings(0).toInt == strings(1).toInt) sum += 1
    })
    sum
  }

  // Best Solution
  // def points(games: Vector[String]): Int = games.map(g => if (g(0) > g(2)) 3 else if (g(0) == g(2)) 1 else 0).sum
}