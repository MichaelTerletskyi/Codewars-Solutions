import org.scalatest._

class OddCountSpec extends FlatSpec with Matchers {

  "oddCount(15)" should "return 7" in {
    OddCount.oddCount(15) should be(7)
  }

  "oddCount(15023)" should "return 7511" in {
    OddCount.oddCount(15023) should be(7511)
  }
}