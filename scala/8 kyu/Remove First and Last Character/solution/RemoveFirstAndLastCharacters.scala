object RemoveFirstAndLastCharacters {
  def removeChars(text: String): String = {
    text.substring(1, text.length - 1)
  }
}