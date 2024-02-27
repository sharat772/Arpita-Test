public class Service implements Saleable {
    private String name;
    private int price;

    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

}
