
case class Person(name: String, age: Int)

val p = Person("ashish", 23)
val p2 = Person("ashish", 23)

p.name
p.age

p eq p2
p == p2

p.hashCode()
p2.hashCode()

p
p.copy(age = 38)
p