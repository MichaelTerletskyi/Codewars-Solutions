import org.scalatest._

class BasicSpec extends FlatSpec with Matchers {
  "isDivisible(4050, 27)" should "return true" in {
    Drills.isDivisible(4050, 27) should be(true)
  }
  "isDivisible(4066, 27)" should "return false" in {
    Drills.isDivisible(4066, 27) should be(false)
  }
  "isDivisible(10000, 20)" should "return true" in {
    Drills.isDivisible(10000, 20) should be(true)
  }
  "isDivisible(10005, 20)" should "return false" in {
    Drills.isDivisible(10005, 20) should be(false)
  }
  "isDivisible(10005, 1)" should "return true" in {
    Drills.isDivisible(10005, 1) should be(true)
  }
}