import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.util.Pretty

object MergesortSpec extends Properties("Mergesort") {

  property("functional") = forAll { (l: List[Int]) =>
    Mergesort.functional(l) == l.sorted
  }

}
