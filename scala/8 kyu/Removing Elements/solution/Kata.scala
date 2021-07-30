object Kata {
  def removeEveryOther[T](list: List[T]): List[T] = {
    list.zipWithIndex.collect {
      case (element, i) if i % 2 == 0 => element
    }
  }
}