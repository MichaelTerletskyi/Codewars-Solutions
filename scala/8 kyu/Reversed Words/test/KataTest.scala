import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.reverseWords("hello world!") === "world! hello")
  }
}