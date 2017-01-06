package datastructures.trees

sealed trait SimpleBinaryTree[+A]
case class Node[A](value: A, left: SimpleBinaryTree[A] = Nil, right: SimpleBinaryTree[A] = Nil) extends SimpleBinaryTree[A]
case object Nil extends SimpleBinaryTree[Nothing]

object SimpleBinaryTree {
  def insert[A](value: A, tree: SimpleBinaryTree[A]): SimpleBinaryTree[A] = {
    tree match {
      case Nil => Node(value, Nil, Nil)
      case Node(v, Nil, Nil) => Node(v, Node(value), Nil)
    }
  }
}
