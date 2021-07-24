import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "twice_as_old(36, 7)" should "return 22" in {
    Sol.twice_as_old(36, 7) should be(22)
  }
  "twice_as_old(55, 30)" should "return 5" in {
    Sol.twice_as_old(55, 30) should be(5)
  }
  "twice_as_old(42, 21)" should "return 0" in {
    Sol.twice_as_old(42, 21) should be(0)
  }
  "twice_as_old(22, 1)" should "return 20" in {
    Sol.twice_as_old(22, 1) should be(20)
  }
  "twice_as_old(29, 0)" should "return 29" in {
    Sol.twice_as_old(29, 0) should be(29)
  }
}