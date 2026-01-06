public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Roma Food", 10);
        restaurant.welcome();

        MenuItem pizza = new Food("Pizza", 2500, "Main course");
        MenuItem burger = new Food("Burger", 1800, "Main course");
        MenuItem steak = new Food("Steak", 3500, "Main course");
        MenuItem cola = new Drink("Cola", 500, "Soft drink");
        MenuItem tea = new Drink("Tea", 300, "Hot drink");

        restaurant.addItem(pizza);
        restaurant.addItem(burger);
        restaurant.addItem(steak);
        restaurant.addItem(cola);
        restaurant.addItem(tea);

        restaurant.showMenu();

        System.out.println();
        System.out.println("== SEARCH ITEM ==");
        MenuItem found = restaurant.searchByName("Pizza");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Item not found.");
        }

        System.out.println();
        System.out.println("== FILTER BY PRICE (<= 2000) ==");
        restaurant.filterByMaxPrice(2000);

        System.out.println();
        System.out.println("== SORT BY PRICE ==");
        restaurant.sortByPrice();
        restaurant.showMenu();

        System.out.println();
        System.out.println("== SORT BY NAME ==");
        restaurant.sortByName();
        restaurant.showMenu();

        System.out.println();
        System.out.println("== ORDERS ==");
        Order order1 = new Order(pizza, 2);
        Order order2 = new Order(cola, 3);

        System.out.println(order1);
        System.out.println(order2);

        double totalBill = order1.calculateTotal() + order2.calculateTotal();
        System.out.println("TOTAL BILL: " + totalBill + " KZT");

        System.out.println();
        System.out.println("== OBJECT COMPARISON ==");
        System.out.println("pizza.equals(new Food(\"Pizza\", 2500, \"Main course\")) -> "
                + pizza.equals(new Food("Pizza", 2500, "Main course")));
        System.out.println("restaurant.hashCode() = " + restaurant.hashCode());
    }
}
