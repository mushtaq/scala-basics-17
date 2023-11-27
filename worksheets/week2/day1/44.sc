import data.Data.books
import tc.app.Book

val string: String = "my name is mushtaq"
val array: Array[Int] = Array(1, 2, 3)

val book = books.head

object A {

  implicit class RichBook(book: Book) {
    def sellingPrice: Double = book.basePrice * 1.10
  }

}

import A.RichBook

println(book.sellingPrice)

A

