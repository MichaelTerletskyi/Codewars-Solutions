import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B") === "8j8mBliB8gimjB8B8jlB")
    assert(Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd") === "88Bifk8hB8BB8BBBB888chl8BhBfd")
    assert(Kata.noSpace("8aaaaa dddd r     ") === "8aaaaaddddr")
    assert(Kata.noSpace("jfBm  gk lf8hg  88lbe8 ") === "jfBmgklf8hg88lbe8")
    assert(Kata.noSpace("8j aam") === "8jaam")
  }
}