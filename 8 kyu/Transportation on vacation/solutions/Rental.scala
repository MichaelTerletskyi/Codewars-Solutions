object Rental {
  def cost(days: Int): Int = {
    var rent = days * 40
    if (days >= 3 && days < 7) rent = rent - 20
    if (days >= 7) rent = rent - 50
    rent
  }
}