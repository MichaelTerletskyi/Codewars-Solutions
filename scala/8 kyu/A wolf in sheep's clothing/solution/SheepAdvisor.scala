// My Solution
object SheepAdvisor {
  def warnTheSheepCheck(queue: Array[String]): String = {
    for ((_, i) <- queue.zipWithIndex) {
      if (queue(i).equals("wolf")) {
        val pos = queue.length - 1 - i
        if (pos != 0) return s"Oi! Sheep number $pos! You are about to be eaten by a wolf!"
      }
    }
    "Pls go away and stop eating my sheep"
  }
}

//Best Solution
//object SheepAdvisor {
//  def warnTheSheepCheck(queue: Array[String]): String =
//    if (queue.last == "wolf") "Pls go away and stop eating my sheep"
//    else s"Oi! Sheep number ${queue.reverse.indexOf("wolf")}! You are about to be eaten by a wolf!"
//}