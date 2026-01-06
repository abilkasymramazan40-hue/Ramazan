public abstract class MenuItem {

    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return name + " (" + category + ") - " + price + " KZT";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MenuItem other = (MenuItem) obj;

        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }

        if (category == null) {
            if (other.category != null) {
                return false;
            }
        } else if (!category.equals(other.category)) {
            return false;
        }

        if (price != other.price) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result = 17;

        if (name != null) {
            result = 31 * result + name.hashCode();
        }

        long temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        if (category != null) {
            result = 31 * result + category.hashCode();
        }

        return result;
    }
}
