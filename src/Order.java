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

    public void setItem(MenuItem item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal() {
        double total = item.getPrice() * quantity;
        if (quantity >= 3) {
            System.out.println("Discount applied!");
            total = total - 5;
        } else {
            System.out.println("No discount.");
        }
        return total;
    }
}
