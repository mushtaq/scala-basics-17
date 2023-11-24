import tc.implementation.Sorter
import tc.lib.Ord

Sorter.sort(List(3, 10, 32, 2, 8, 12))(Ord.intOrd)
Sorter.sort(List(3, 10, 32, 2, 8, 12))(Ord.intDesOrd)
Sorter.sort(List("z", "abc", "a", "ss"))(Ord.strOrd)
//Sorter.sort(data.Data.books)


