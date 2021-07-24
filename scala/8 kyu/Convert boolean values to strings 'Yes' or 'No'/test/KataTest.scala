import org.scalatest._

class KataTest extends FlatSpec with Matchers {

  "boolToWord(true)" should "return \"Yes\"" in {
    Kata.boolToWord(true) should be ("Yes")
  }

  "boolToWord(false)" should "return \"No\"" in {
    Kata.boolToWord(false) should be ("No")
  }
}