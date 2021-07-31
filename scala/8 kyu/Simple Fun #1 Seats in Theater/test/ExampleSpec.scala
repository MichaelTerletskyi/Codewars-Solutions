import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "seatsInTheater(16,11,5,3)" should "return 96" in {
    Seats.seatsInTheater(16, 11, 5, 3) should be(96)
  }
  "seatsInTheater(1,1,1,1)" should "return 0" in {
    Seats.seatsInTheater(1, 1, 1, 1) should be(0)
  }
  "seatsInTheater(13,6,8,3)" should "return 18" in {
    Seats.seatsInTheater(13, 6, 8, 3) should be(18)
  }
  "seatsInTheater(60,100,60,1)" should "return 99" in {
    Seats.seatsInTheater(60, 100, 60, 1) should be(99)
  }
  "seatsInTheater(1000,1000,1000,1000)" should "return 0" in {
    Seats.seatsInTheater(1000, 1000, 1000, 1000) should be(0)
  }
}