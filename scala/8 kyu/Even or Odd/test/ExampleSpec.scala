import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  val tests = List(
    (2, "Even"),
    (0, "Even"),
    (7, "Odd"),
    (1, "Odd"),
  )
  tests.foreach {
    case (input, expected) =>
      s"evenOrOdd($input)" should s"return $expected" in {
        Sol.evenOrOdd(input) should be(expected)
      }
  }
}