object Kata {
  def past(hour: Int, minute: Int, second: Int): Int = hour * 60 * 60 * 1000 + minute * 60 * 1000 + second * 1000
}