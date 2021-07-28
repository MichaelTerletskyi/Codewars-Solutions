import org.scalatest._

class ReversedStringTest extends FlatSpec with Matchers {
  "Kata.solution" should "pass fixed tests" in {
    Kata.solution("dlrow") should equal("world")
  }
}