package tc.implementation

import tc.lib.Ord

object Sorter {

  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case head :: tail => insert(head, sort(tail)(ord))(ord)
    case Nil          => Nil
  }

//  def sort2(xs: List[String]): List[String] = xs match {
//    case head :: tail => insert2(head, sort2(tail))
//    case Nil          => Nil
//  }

  def insert[T](x: T, sortedList: List[T])(ord: Ord[T]): List[T] = sortedList match {
    case head :: _ if ord.compare(x, head) => x :: sortedList
    case head :: tail                      => head :: insert(x, tail)(ord)
    case Nil                               => List(x)
  }

//  def insert2(x: String, sortedList: List[String]): List[String] = sortedList match {
//    case head :: _ if x <= head => x :: sortedList
//    case head :: tail           => head :: insert2(x, tail)
//    case Nil                    => List(x)
//  }

}
