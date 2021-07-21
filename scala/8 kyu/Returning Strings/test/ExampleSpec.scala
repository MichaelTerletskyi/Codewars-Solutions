import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "greet(\"Ryan\")" should "return Hello, Ryan how are you doing today?" in {
    Greeter.greet("Ryan") should be ("Hello, Ryan how are you doing today?")
  }
  "greet(\"Shingles\")" should "return Hello, Shingles how are you doing today?" in {
    Greeter.greet("Shingles") should be ("Hello, Shingles how are you doing today?")
  }
}