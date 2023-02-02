import java.util.LinkedList;

public class Account {

    private LinkedList<Transaction> transactionHistory = new LinkedList<>();
    private String accountName;
    private float balance;

    public void charge(Transaction charge) {
        this.transactionHistory.add(charge);
        this.balance -= charge.getAmount();
    }



}
