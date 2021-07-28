import org.scalatest._

class ExampleSpec extends FunSpec {
  it("Basic tests") {
    assert(Kata.move(0, 4) === 8)
    assert(Kata.move(3, 6) === 15)
    assert(Kata.move(2, 5) === 12)
  }
}