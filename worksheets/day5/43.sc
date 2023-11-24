import tc.implementation.Sorter
import tc.lib.Ord
import tc.app.Book

Sorter.sort(List(3, 10, 32, 2, 8, 12))(Ord.intOrd)
Sorter.sort(List(Some(10), None, Some(3)))(Ord.optOrd(Ord.intOrd))

Sorter.sort(List(3, 10, 32, 2, 8, 12))(Ord.intDesOrd)

Sorter.sort(List("z", "abc", "a", "ss"))(Ord.strOrd)
Sorter.sort(List(Some("z"), Some("abc"), None))(Ord.optOrd(Ord.strOrd))


Sorter.sort(List((3, "abc"), (1, "xyz"), (3, "mno")))(
  Ord.pairOrd(Ord.intOrd, Ord.strOrd)
)

Sorter.sort(data.Data.books)(Book.bookOrd).foreach(println)
