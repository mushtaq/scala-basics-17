package tc.implementation

import tc.lib.Ord

object Sorter {

  def sort(xs: List[Int]): List[Int] = xs match {
    case head :: tail => insert(head, sort(tail))
    case Nil => Nil
  }

  def insert(x: Int, sortedList: List[Int]): List[Int] = sortedList match {
    case head :: _ if x <= head => x :: sortedList
    case head :: tail => head :: insert(x, tail)
    case Nil => List(x)
  }

}
