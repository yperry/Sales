package inheritance

class Customer(val firstName: String, val lastName: String) {
  val id: Int = Customer.nextId
  val shoppingBasket = new ShoppingBasket(10)

  def addItem(item: Item) = {
    shoppingBasket.add(item)
  }

  def total: Double = {
    shoppingBasket.items.map(_.price).sum
  }
}

// Singleton.
// Usually for functions (methods that do not depend class fields) or factory
object Customer {
  private var _id = 0

  def nextId = {
    _id += 1
    _id
  }

  def apply(firstName: String, lastName: String): Unit = {
    new Customer(firstName, lastName)
  }
}
