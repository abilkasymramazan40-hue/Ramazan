public class Restaurant {

    private String name;
    private MenuItem[] menu;
    private int size; // how many items are really used

    public Restaurant(String name, int capacity) {
        this.name = name;
        this.menu = new MenuItem[capacity];
        this.size = 0;
    }

    public void welcome() {
        System.out.println("Welcome to \"" + name + "\" restaurant!");
    }

    public void addItem(MenuItem item) {
        if (size < menu.length) {
            menu[size] = item;
            size++;
        } else {
            System.out.println("Menu is full, cannot add more items.");
        }
    }

    public void showMenu() {
        System.out.println("========== MENU ==========");
        for (int i = 0; i < size; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("==========================");
    }

    public MenuItem searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (menu[i].getName().equalsIgnoreCase(name)) {
                return menu[i];
            }
        }
        return null;
    }

    public void filterByMaxPrice(double maxPrice) {
        System.out.println("Items with price <= " + maxPrice + " KZT:");
        for (int i = 0; i < size; i++) {
            if (menu[i].getPrice() <= maxPrice) {
                System.out.println(menu[i]);
            }
        }
    }

    public void sortByPrice() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (menu[i].getPrice() > menu[j].getPrice()) {
                    MenuItem temp = menu[i];
                    menu[i] = menu[j];
                    menu[j] = temp;
                }
            }
        }
    }

    public void sortByName() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (menu[i].getName().compareTo(menu[j].getName()) > 0) {
                    MenuItem temp = menu[i];
                    menu[i] = menu[j];
                    menu[j] = temp;
                }
            }
        }
    }

    public String toString() {
        return "Restaurant: " + name;
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
        Restaurant other = (Restaurant) obj;

        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }

        if (size != other.size) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!menu[i].equals(other.menu[i])) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int result = 17;

        if (name != null) {
            result = 31 * result + name.hashCode();
        }

        result = 31 * result + size;

        for (int i = 0; i < size; i++) {
            result = 31 * result + menu[i].hashCode();
        }

        return result;
    }
}
