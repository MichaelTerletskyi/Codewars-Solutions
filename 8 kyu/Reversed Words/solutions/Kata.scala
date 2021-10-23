object Kata {

  // My solution
  def reverseWords(str: String): String = {
    var res = ""
    str.split(" ").reverse.foreach(s => res += (s + " "))
    res.trim()
  }


  // Best solution
  // def reverseWords(str: String): String = str.split(' ').reverse.mkString(" ")
}