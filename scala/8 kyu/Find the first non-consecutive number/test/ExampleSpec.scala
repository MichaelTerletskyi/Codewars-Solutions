// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// See http://www.scalatest.org/at_a_glance for example usages
class ExampleSpec extends FlatSpec with Matchers {
  "a simple example" should "return 6" in {
    Fnc.firstNonConsecutive(Seq(1,2,3,4,6,7,8)) should be (Some(6))
  }
}