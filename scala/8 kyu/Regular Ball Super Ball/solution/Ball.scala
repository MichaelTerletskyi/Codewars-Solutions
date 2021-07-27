// My Solution
class Ball(_bType: String) {
  def this() = this("")

  def ballType(): String = {
    if(_bType.equals("super")) return _bType
    if(_bType.equals("regular") || _bType.isEmpty) return "regular"
    _bType
  }
}

// Best Solution
// case class Ball(ballType: String = "regular")