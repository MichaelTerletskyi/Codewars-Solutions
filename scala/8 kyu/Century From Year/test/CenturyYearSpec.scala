import org.scalatest._

class CenturyYearSpec extends FlatSpec with Matchers {
  "centuryFromYear(1705)" should "return 18" in {
    CenturyYear.centuryFromYear(1705) should be(18)
  }
  "centuryFromYear(1900)" should "return 19" in {
    CenturyYear.centuryFromYear(1900) should be(19)
  }
  "centuryFromYear(1601)" should "return 17" in {
    CenturyYear.centuryFromYear(1601) should be(17)
  }
  "centuryFromYear(2000)" should "return 20" in {
    CenturyYear.centuryFromYear(2000) should be(20)
  }
}