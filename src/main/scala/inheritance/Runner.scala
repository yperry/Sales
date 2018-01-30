package inheritance

class Runner {
  def main(args: Array[String]): Unit = {
    val greg = new Customer("Greg", "deGreg")
    val mark = new DiscountedCustomer("Mark", "deMark")

    val bottle = new Item("Bottle", 1d)
    val plate = new Item("Plate", 2.5d)

    greg.addItem(bottle)
    greg.addItem(plate)

    mark.addItem(bottle)
    mark.addItem(plate)

    println("Total")
    val customers : Seq[Customer] = Seq[Customer](greg, mark)
    customers.foreach {x=> println(x.total)}

  }
}


// decompile java -jar cfr_0_85.jar target/scal
