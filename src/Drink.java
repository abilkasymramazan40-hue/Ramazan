public class Drink extends MenuItem {

    public Drink(String name, double price, String category) {
        super(name, price, category);
    }

    public double calculatePrice() {
        return getPrice() * 0.9; // 10% discount
    }

    public String toString() {
        return "[Drink] " + super.toString() + " (10% discount)";
    }
}
