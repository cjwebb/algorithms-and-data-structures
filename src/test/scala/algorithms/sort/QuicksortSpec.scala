import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.util.Pretty

object QuicksortSpec extends Properties("Quicksort") {

  property("functional") = forAll { (l: List[Int]) =>
    Quicksort.functional(l) == l.sorted
  }

}
