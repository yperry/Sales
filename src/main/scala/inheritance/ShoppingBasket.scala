package inheritance

class ShoppingBasket(var value: Integer) {
  val items: Seq[Item] = Seq[Item]()
  def add(item: Item) = {
    items :+ item
  }
}
