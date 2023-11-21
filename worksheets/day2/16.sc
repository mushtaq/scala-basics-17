import data.Data.books



books
  .foreach(println)


books.filter(b => b.author == "odersky")
  .foreach(println)

