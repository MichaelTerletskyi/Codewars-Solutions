object Seats {
  def seatsInTheater(totalCols: Int, totalRows: Int, col: Int, row: Int): Int = (totalRows - row) * (totalCols - (col - 1))
}