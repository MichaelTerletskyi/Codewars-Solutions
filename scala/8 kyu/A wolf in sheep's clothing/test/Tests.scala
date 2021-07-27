import org.scalatest._
import org.scalatest.Assertions._
import TestUtils._

class Tests extends FlatSpec {
  it should "Fixed tests" in {
    testing(Array[String]("sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"), "Oi! Sheep number 2! You are about to be eaten by a wolf!")
    testing(Array[String]("sheep", "sheep", "wolf"), "Pls go away and stop eating my sheep")
    testing(Array[String]("sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"), "Oi! Sheep number 5! You are about to be eaten by a wolf!")
    testing(Array[String]("wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"), "Oi! Sheep number 6! You are about to be eaten by a wolf!")
    testing(Array[String]("sheep", "wolf", "sheep"), "Oi! Sheep number 1! You are about to be eaten by a wolf!")
    testing(Array[String]("wolf"), "Pls go away and stop eating my sheep")
  }
}