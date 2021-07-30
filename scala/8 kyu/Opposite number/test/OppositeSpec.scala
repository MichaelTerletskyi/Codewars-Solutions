import org.scalatest._

class OppositeSpec extends FlatSpec with Matchers {
  "opposite(1)" should "return -1" in {
    Opposite.opposite(1) should be(-1)
  }
}