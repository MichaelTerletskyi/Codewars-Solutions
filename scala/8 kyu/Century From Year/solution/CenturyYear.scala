object CenturyYear {

  // My Solution
  def centuryFromYear(year: Int): Int = {
    val range = year.toString.length - 2
    val century = year.toString.substring(0, range).toInt
    val years = year.toString.substring(range, year.toString.length)
    val counter = years.count(d => d.equals('0'))
    if (counter == years.length) century else century + 1
  }

  // Best Solution
  // def centuryFromYear(year: Int): Int = math.ceil( year / 100.0 ).toInt;
}