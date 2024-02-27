import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 100000, 2000);

        Purchase laptopPurchase = new Purchase(laptop, 2);

        int deliveryCost = laptop.calculateDelivery();
        System.out.println("Delivery cost for the laptop: " + deliveryCost);

        Refund refund = new Refund(5000, "Defective product");
        System.out.println("Refund reason: " + refund.getReason());
        Customer customer = new Customer();

        customer.transact(laptopPurchase);
        customer.transact(refund);
        ArrayList<Transaction> customerTransactions = customer.getTransactions();
        System.out.println("Customer transactions:");
        for (Transaction transaction : customerTransactions) {
            System.out.println(transaction.getClass().getSimpleName() + ": " + transaction.getValue());
        }
        System.out.println("Total value of transactions: " + customer.getTotal());
    }
}