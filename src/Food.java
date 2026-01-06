public class Food extends MenuItem {

    public Food(String name, double price, String category) {
        super(name, price, category);
    }

    public double calculatePrice() {
        return getPrice(); // no discount
    }

    public String toString() {
        return "[Food] " + super.toString();
    }
}
