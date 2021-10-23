object Love {
  def lovefunc(flower1: Int, flower2: Int): Boolean = {
    Seq(flower1, flower2).count(v => v % 2 == 0 || v == 0) == 1
  }
}