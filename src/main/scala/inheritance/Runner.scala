package inheritance

class Runner {
  def main(args: Array[String]): Unit = {
    val greg = Customer("Greg", "deGreg")
    val mark = new DiscountedCustomer("Mark", "deMark")

    val bottle = new Item("Bottle", 1d)
    val plate = new Item("Plate", 2.5d)

    greg.add
  }
}


// decompile java -jar cfr_0_85.jar target/scal
