import org.scalatest._

class KataSpec extends FunSuite {
  test("basic tests") {
    assert(Kata.past(0, 1, 1) === 61000)
    assert(Kata.past(1, 1, 1) === 3661000)
    assert(Kata.past(0, 0, 0) === 0)
    assert(Kata.past(1, 0, 1) === 3601000)
    assert(Kata.past(1, 0, 0) === 3600000)
  }
}