public class Main {
public static void main(String[] args) {
    System.out.println("═══ Food Ordering System ═══\n");

    System.out.println("Creating orders and adding items...");

    Order order1 = new Order("Alice Johnson");
    Order order2 = new Order("Bob Smith");
    Order order3 = new Order("Charlie Brown");

    try {
        order1.addMultipleItems(
                new String[]{"Pizza", "Pasta", "Salad"},
                12.99, 8.75, 3.99
        );
        System.out.println("Items added: Pizza, Pasta, Salad");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        order2.addMultipleItems(
                new String[]{"Burger", "Lasagna", "Soda", "Chicken Fillet", "Ice Cream"},
                8.50, 3.25, 4.00, 10.20, 12.50
        );
        System.out.println("Items added: Burger, Lasagna, Soda, Chicken Fillet, Ice Cream");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        order3.addItem("Hotdog", -5.00);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        order3.addItem("", 5.50);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        order3.addMultipleItems(
                new String[]{"Taco", "Juice"},
                7.50, 10.25
        );
        System.out.println("Items added: Taco, Juice");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    System.out.println("\nOrder Results:");
    System.out.println(order1.displayOrder());
    System.out.println(order2.displayOrder());
    System.out.println(order3.displayOrder());

    System.out.println("\nTotal orders created: " + Order.getTotalOrders());

    Order[] allOrders = {order1, order2, order3};
    Order largestOrder = allOrders[0];
    for (Order o : allOrders) {
        if (o.getTotalAmount() > largestOrder.getTotalAmount()) {
            largestOrder = o;
        }
    }

    System.out.printf("Largest order: %s ($%.2f)\n",
            largestOrder.getCustomerName(), largestOrder.getTotalAmount());
}
}