package inheritance

class DiscountedCustomer(firstName: String, lastName : String)
  extends Customer(firstName, lastName) {

  override def total: Double = {
    super.total * 0.9
  }
}
