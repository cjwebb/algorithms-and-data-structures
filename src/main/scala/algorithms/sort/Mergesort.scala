object Mergesort {

  /**
   * Functional implementation of Mergesort using List concatentation.
   *
   * For similar Haskell code, see https://gist.github.com/morae/8494016
   */
  def functional[X](xs: List[X])(implicit ord: Ordering[X]): List[X] = {
    xs match {
      case Nil => xs
      case x :: Nil => xs
      case xs =>
        val (left, right) = splitInHalf(xs)
        merge(functional(left), functional(right))
    }
  }

  private def splitInHalf[X](xs: List[X]): (List[X], List[X]) = {
    val (left, right) = xs.zipWithIndex.partition(_._2 % 2 == 0)
    (left.map(_._1), right.map(_._1))
  }

  private def merge[X](xs: List[X], ys: List[X])(implicit ord: Ordering[X]): List[X] = {
    import ord.mkOrderingOps

    (xs, ys) match {
      case (xs, Nil) => xs
      case (Nil, ys) => ys
      case (x :: xs, y :: ys) =>
        if (x <= y) x :: merge(xs, y :: ys)
        else y :: merge(x :: xs, ys)
    }
  }

}
