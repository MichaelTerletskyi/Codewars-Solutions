import org.scalatest._

class FarmTest extends FlatSpec with Matchers {

  val sheep = Array(
    true, true, true, false,
    true, true, true, true,
    true, false, true, false,
    true, false, false, true,
    true, true, true, true,
    false, false, true, true
  )
  val sheepCount = 17

  s"countSheep(${sheep.mkString(", ")})" should s"return $sheepCount" in {
    Farm.countSheep(sheep) should be(sheepCount)
  }
}