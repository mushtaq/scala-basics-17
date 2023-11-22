
trait Day

object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}

trait Customer

object Customer {
  object Regular extends Customer
  object Rewards extends Customer
}

case class Category(customer: Customer, day: Day)

case class Hotel(name: String, rating: Int, rates: Map[Category, Int])


object Data {
  val hotels = List(
    Hotel("Lakewood", 3, Map(
      Category(Customer.Regular, Day.Weekday) -> 110,
      Category(Customer.Rewards, Day.Weekday) -> 80,
      Category(Customer.Regular, Day.Weekend) -> 90,
      Category(Customer.Rewards, Day.Weekend) -> 80
    )),
    Hotel("Bridgewood", 4, Map(
      Category(Customer.Regular, Day.Weekday) -> 160,
      Category(Customer.Rewards, Day.Weekday) -> 110,
      Category(Customer.Regular, Day.Weekend) -> 60,
      Category(Customer.Rewards, Day.Weekend) -> 50
    )),
    Hotel("Ridgewood", 5, Map(
      Category(Customer.Regular, Day.Weekday) -> 220,
      Category(Customer.Rewards, Day.Weekday) -> 100,
      Category(Customer.Regular, Day.Weekend) -> 150,
      Category(Customer.Rewards, Day.Weekend) -> 40
    )),
  )
}
