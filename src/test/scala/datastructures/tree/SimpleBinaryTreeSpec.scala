package datastructures.trees

import org.scalatest.{FreeSpec, Matchers}

class SimpleBinaryTreeSpec extends FreeSpec with Matchers {

  "insert root" in {
    SimpleBinaryTree.insert("A", Nil) shouldBe Node("A")
  }

  "insert new value to Root" in {
    val tree = Node("A", Nil, Nil)
    SimpleBinaryTree.insert("B", tree) shouldBe Node("A", Node("B"))
  }

}
