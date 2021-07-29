import org.scalatest._

class KataTest extends FlatSpec with Matchers {

  "summation(1)" should "return 1" in {
    Kata.summation(1) should be(1)
  }
  "summation(8)" should "return 36" in {
    Kata.summation(8) should be(36)
  }
}