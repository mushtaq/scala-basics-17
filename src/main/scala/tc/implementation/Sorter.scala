package tc.implementation

import tc.lib.Ord

object Sorter {

  def sort[T](xs: List[T])(implicit ord: Ord[T]): List[T] = xs match {
    case head :: tail => insert(head, sort(tail))
    case Nil          => Nil
  }

  def insert[T](x: T, sortedList: List[T])(implicit ord: Ord[T]): List[T] = sortedList match {
    case head :: _ if ord.compare(x, head) => x :: sortedList
    case head :: tail                      => head :: insert(x, tail)
    case Nil                               => List(x)
  }


}
