// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    val x =customer.orders.filter {
        it.isDelivered
    }.flatMap { it.products }

    val y = Order::isDelivered
    val y2: (Order) -> Boolean = {
        it.isDelivered
    }

    return customer.orders.filter(Order::isDelivered).flatMap(Order::products)
        .maxByOrNull(Product::price)

}
// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
        .flatMap(Customer::getOrderedProducts)
        .count { it == product }
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap(Order::products)
