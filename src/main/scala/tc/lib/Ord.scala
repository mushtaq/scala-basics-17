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
}
