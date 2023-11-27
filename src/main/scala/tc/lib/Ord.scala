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

  def pairOrd[T1, T2](t1Ord: Ord[T1], t2Ord: Ord[T2]): Ord[(T1, T2)] = new Ord[(T1, T2)] {
    override def compare(a: (T1, T2), b: (T1, T2)): Boolean =
      if(a._1 == b._1) t2Ord.compare(a._2, b._2) else t1Ord.compare(a._1, b._1)
  }

}
