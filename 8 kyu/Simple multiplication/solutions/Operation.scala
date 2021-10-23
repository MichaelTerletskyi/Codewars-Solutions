object Operation {
  def multiply(num: Int): Int = if (num == 0 || num % 2 == 0) num * 8 else num * 9
}