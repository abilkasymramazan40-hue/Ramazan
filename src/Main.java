public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Roma Food");
        restaurant.welcome();

        MenuItem pizza = new MenuItem("Pizza", 2500, "First Food");
        MenuItem burger = new MenuItem("Burger", 1800, "First Food");
        MenuItem steak = new MenuItem("Steak", 3500, "Second Food");
        MenuItem drink = new MenuItem("Drink", 500, "Drinks");
        MenuItem tea = new MenuItem("Tea", 300, "Tea time");

        pizza.showInfo();
        burger.showInfo();
        steak.showInfo();
        drink.showInfo();
        tea.showInfo();

        Order order1 = new Order(pizza, 2);
        Order order2 = new Order(burger, 4);

        System.out.println("Order 1 total: " + order1.calculateTotal());
        System.out.println("Order 2 total: " + order2.calculateTotal());

        if (order1.calculateTotal() > order2.calculateTotal()) {
            System.out.println("Order 1 is more expensive.");
        } else {
            System.out.println("Order 2 is more expensive.");
        }
    }
}
