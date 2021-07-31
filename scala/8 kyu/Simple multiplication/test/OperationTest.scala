import org.scalatest._

class OperationTest extends FlatSpec with Matchers {

  val tests = List(
    (1, 9),
    (3, 27),
    (2, 16),
    (4, 32)
  )

  tests.foreach {
    case (input, expected) =>
      s"multiply($input)" should s"return $expected" in {
        Operation.multiply(input) should be(expected)
      }
  }
}