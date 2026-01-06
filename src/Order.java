public class Order {

    private MenuItem item;
    private int quantity;

    public Order(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {
        double total = item.calculatePrice() * quantity;
        return total;
    }

    public String toString() {
        return item.getName() + " x " + quantity + " = " + calculateTotal() + " KZT";
    }
}
