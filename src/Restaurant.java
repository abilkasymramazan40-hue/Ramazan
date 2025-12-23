public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Welcome to " + name + " restaurant!");
    }
}
