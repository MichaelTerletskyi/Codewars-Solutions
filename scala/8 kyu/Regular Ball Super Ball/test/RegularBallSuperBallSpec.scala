import org.scalatest.FunSpec

class RegularBallSuperBallSpec extends FunSpec {
  describe("no arguments") {
    it("default") {
      val b1 = new Ball()

      assertResult("regular") {
        b1.ballType
      }
    }
  }
  describe("with arguments") {
    it("regular") {
      val b2 = new Ball("regular")

      assertResult("regular") {
        b2.ballType
      }
    }
    it("super") {
      val b2 = new Ball("super")

      assertResult("super") {
        b2.ballType
      }
    }
  }
}
