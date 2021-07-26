import org.scalatest._

class SmallestIntegersFinderSpec extends FunSpec {
  describe("SmallestIntegersFinder") {
    it("fixedTests") {
      assertResult(8) {SmallestIntegerFinder.findSmallestInt(List(78,56,232,12,8))}
      assertResult(12) {SmallestIntegerFinder.findSmallestInt(List(78,56,232,12,18))}
      assertResult(56) {SmallestIntegerFinder.findSmallestInt(List(78,56,232,412,228))}
      assertResult(0) {SmallestIntegerFinder.findSmallestInt(List(78,56,232,12,0))}
      assertResult(1) {SmallestIntegerFinder.findSmallestInt(List(1,56,232,12,8))}
    }
  }
}