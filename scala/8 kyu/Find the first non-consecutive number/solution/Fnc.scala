object Fnc {
  def firstNonConsecutive(values: Seq[Int]): Option[Int] = {
    for ((_, i) <- values.zipWithIndex) {
      if ((i + 1) < values.length) {
        if (values(i) - values(i + 1) < -1) {
          return Some(values(i + 1))
        }
      }
    }
    None
  }
}