import java.util.ArrayList;

class Customer {
    private ArrayList<Transaction> transactions;

    public Customer() {
        this.transactions = new ArrayList<>();
    }

    public void transact(Transaction transaction) {
        transactions.add(transaction);
    }

    public int getTotal() {
        int total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.getValue();
        }
        return total;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}