public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 100000, 2000);

        Purchase laptopPurchase = new Purchase(laptop, 2);

        Refund refund = new Refund(5000, "Defective product");

        Customer customer = new Customer();

        customer.transact(laptopPurchase);
        customer.transact(refund);

        System.out.println("Total value of transactions: " + customer.getTotal());
    }
}