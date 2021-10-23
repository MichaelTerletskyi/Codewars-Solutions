object Pillars {
  def distance(num_pill: Int, dist: Int, width: Int): Int = {
    val length = 100 * ((num_pill - 1) * dist)
    if (num_pill <= 2) length else length + ((num_pill - 2) * width)
  }
}