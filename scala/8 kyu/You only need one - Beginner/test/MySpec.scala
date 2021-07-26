import org.scalatest._

class MySpec extends FlatSpec {
  import Solution.check

  private val tests = List(
    (true, List(66, 101), 66),
    (false, List(78, 117, 110, 99, 104, 117, 107, 115), 8),
    (true, List(101, 45, 75, 105, 99, 107), 107),
    (true, List(80, 117, 115, 104, 45, 85, 112, 115), 45),
    (true, List('t', 'e', 's', 't'), 'e'),
    (false, List("what", "a", "great", "kata"), "kat"),
    (true, List(66, "codewars", 11, "alex loves pushups"), "alex loves pushups"),
    (false, List("come", "on", 110, "2500", 10, '!', 7, 15), "Come"),
    (true, List("when's", "the", "next", "Katathon?", 9, 7), "Katathon?"),
    (false, List(8, 7, 5, "bored", "of", "writing", "tests", 115), 45),
    (true, List("anyone", "want", "to", "hire", "me?"), "me?"),
  )

  tests.foreach({
    case(res, lst, elem) => s"check( $lst , $elem )" should s"return $res" in {
      assertResult(res)(check(lst,elem))
    }
  })
}