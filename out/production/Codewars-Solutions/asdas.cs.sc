def firstNonConsecutive(values: Seq[Int]): Option[Int] = {
  var tempVar: Int = values(0)
  var previousDiff: Int = 0
  values.drop(1).foreach(v => {
    val currentDiff = tempVar - v
    if (previousDiff != 0) {
      val result = previousDiff - currentDiff
      if (result > 1 || result < 1) {
        return Some(v)
      }
    }
    tempVar = v
    previousDiff = currentDiff
  })
  None
}

firstNonConsecutive(Seq(1, 2, 3, 4, 6, 7, 8)) // 6
//firstNonConsecutive(Seq(0, 1, 2, 4, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 19)) // 4
//firstNonConsecutive(Seq(0, 2, 5, 6, 7, 8, 11, 12, 14, 15, 17, 19)) // 5


//var tempVar: Int = values(0)
//var previousDiff: Int = 0
//values.drop(1).foreach(v => {
//  val currentDiff = tempVar - v
//  println(String.format("%s : %s = %s, %s =  %s", v, "previousDiff", previousDiff, "currentDiff", currentDiff))
//  if (previousDiff != 0) {
//    if (previousDiff != currentDiff) {
//      return Some(v)
//    }
//  }
//  tempVar = v
//  previousDiff = currentDiff
//})