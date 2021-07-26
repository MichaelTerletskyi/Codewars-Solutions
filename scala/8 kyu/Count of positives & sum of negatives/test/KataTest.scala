import org.scalatest._

class KataTest extends FlatSpec with Matchers {

  val tests = List(
    (Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15), (10, -65)),
    (Array(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14), (8, -50)),
    (Array(1), (1, 0)),
    (Array(-1), (0, -1)),
    (Array(0, 0, 0, 0, 0, 0, 0, 0, 0), (0, 0)),
    (Array[Int](), (0, 0))
  )

  tests.foreach {
    case (input, expected) =>
      s"""countPositivesSumNegatives(Array(${input.mkString(", ")}))""" should s"return $expected" in {
        Kata.countPositivesSumNegatives(input) should be(expected)
      }
  }
}