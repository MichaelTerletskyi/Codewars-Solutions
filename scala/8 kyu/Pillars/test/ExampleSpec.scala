import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "for number of pillars: 1, distance: 10 m and width: 10 cm" should "return 0" in {
    Pillars.distance(1, 10, 10) should be(0)
  }

  "for number of pillars: 2, distance: 20 m and width: 25 cm" should "return 2000" in {
    Pillars.distance(2, 20, 25) should be(2000)
  }

  "for number of pillars: 11, distance: 15 m and width: 30 cm" should "return 15270" in {
    Pillars.distance(11, 15, 30) should be(15270)
  }
}