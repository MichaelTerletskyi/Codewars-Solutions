import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.grow(List(1, 2, 3)) === 6)
    assert(Kata.grow(List(4, 1, 1, 1, 4)) === 16)
    assert(Kata.grow(List(2, 2, 2, 2, 2, 2)) === 64)
  }
}