import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "fixTheMeerkat(\"tail\", \"body\", \"head\")" should "return List(\"head\", \"body\", \"tail\")" in {
    Lists.fixTheMeerkat(List("tail", "body", "head")) should be(List("head", "body", "tail"))
  }
  "fixTheMeerkat(\"tails\", \"body\", \"heads\")" should "return List(\"heads\", \"body\", \"tails\")" in {
    Lists.fixTheMeerkat(List("tails", "body", "heads")) should be(List("heads", "body", "tails"))
  }
  "fixTheMeerkat(\"bottom\", \"middle\", \"top\")" should "return List(\"top\", \"middle\", \"bottom\")" in {
    Lists.fixTheMeerkat(List("bottom", "middle", "top")) should be(List("top", "middle", "bottom"))
  }
  "fixTheMeerkat(\"lower legs\", \"torso\", \"upper legs\")" should "return List(\"upper legs\", \"torso\", \"lower legs\")" in {
    Lists.fixTheMeerkat(List("lower legs", "torso", "upper legs")) should be(List("upper legs", "torso", "lower legs"))
  }
  "fixTheMeerkat(\"ground\", \"rainbow\", \"sky\")" should "return List(\"sky\", \"rainbow\", \"ground\")" in {
    Lists.fixTheMeerkat(List("ground", "rainbow", "sky")) should be(List("sky", "rainbow", "ground"))
  }
}