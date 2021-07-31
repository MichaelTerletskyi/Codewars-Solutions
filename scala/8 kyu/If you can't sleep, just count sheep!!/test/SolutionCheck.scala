import org.scalatest._

class SolutionCheck extends FlatSpec with Matchers {
  "countingSheep" should "return correct data" in {
    Kata.countingSheep(1) should be("1 sheep...")
    Kata.countingSheep(2) should be("1 sheep...2 sheep...")
    Kata.countingSheep(3) should be("1 sheep...2 sheep...3 sheep...")
  }
}