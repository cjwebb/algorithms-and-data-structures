object Quicksort {

  /**
   * Functional implementation of Quicksort using List concatentation
   */
  def functional[X](xs: List[X])(implicit ord: Ordering[X]): List[X] = {
    import ord.mkOrderingOps
    xs match {
      case Nil => Nil
      case x :: xs => {
        val (low, high) = xs.partition(_ < x)
        functional(low) ::: x :: functional(high)
      }
    }
  }

}
