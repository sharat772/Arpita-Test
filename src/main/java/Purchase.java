class Purchase extends Transaction {
    private Saleable saleable;
    private int quantity;

    public Purchase(Saleable saleable, int quantity) {
        super(saleable.getPrice() * quantity);
        this.saleable = saleable;
        this.quantity = quantity;
    }

    public Saleable getSaleable() {
        return saleable;
    }

    public int getQuantity() {
        return quantity;
    }
}