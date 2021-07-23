import org.scalatest._

class NegativeTest extends FlatSpec with Matchers {

  s"makeNegative(42)" should s"return -42" in {
    Negative.makeNegative(42) should be(-42)
  }
}