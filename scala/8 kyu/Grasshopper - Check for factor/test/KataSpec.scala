import org.scalatest._
import scala.util.Random

class KataSpec extends FunSuite {
  test("Basic tests") {
    assert(Kata.checkForFactor(10, 2) === true)
    assert(Kata.checkForFactor(63, 7) === true)
    assert(Kata.checkForFactor(2450, 5) === true)
    assert(Kata.checkForFactor(24612, 3) === true)
    assert(Kata.checkForFactor(9, 2) === false)
    assert(Kata.checkForFactor(653, 7) === false)
    assert(Kata.checkForFactor(2453, 5) === false)
    assert(Kata.checkForFactor(24617, 3) === false)
  }
}