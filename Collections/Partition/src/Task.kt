// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val(deliverd, undeliverd) = it.orders.partition { it.isDelivered }
    undeliverd.size>deliverd.size
}.toSet()
