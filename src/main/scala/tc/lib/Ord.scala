package tc.lib

trait Ord[T] {
  def compare(a: T, b: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = new Ord[Int] {
    override def compare(a: Int, b: Int): Boolean = a <= b
  }

  val intDesOrd: Ord[Int] = new Ord[Int] {
    override def compare(a: Int, b: Int): Boolean = a >= b
  }

  val strOrd: Ord[String] = new Ord[String] {
    override def compare(a: String, b: String): Boolean = a <= b
  }

  def optOrd[T](ord: Ord[T]): Ord[Option[T]] = new Ord[Option[T]] {
    override def compare(a: Option[T], b: Option[T]): Boolean = (a, b) match {
      case (Some(x), Some(y)) => ord.compare(x, y)
      case (None, _)          => true
      case (_, None)          => false
    }
  }

}
