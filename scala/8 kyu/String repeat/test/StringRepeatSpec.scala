import org.scalatest.{FlatSpec, Matchers}

class StringRepeatSpec extends FlatSpec {
  "repeatStr method given counter is 3 and string *" should " return string ***" in {
    assert(StringRepeat.repeatStr(3, "*") == "***")
  }
}