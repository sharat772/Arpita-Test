class Product implements Saleable {
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int calculateDelivery() {
        if (weight < 100) {
            return 0;
        } else if (weight < 1000) {
            return (int) (0.2 * weight);
        } else {
            return (int) (0.2 * 1000 + 0.1 * (weight - 1000));
        }
    }
}