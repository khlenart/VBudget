import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Transaction {

    private String name;
    private String description;
    private Account account;
    private float amount;
    private Categories category;
    private GregorianCalendar date;


    public Transaction(String name, String description, Account account, float amount,
                       Categories category, GregorianCalendar date) {
        this.name = name;
        this.description = description;
        this.account = account;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }
    public Transaction(String name, String description, Account account, float amount,
                       Categories category) {
        this.name = name;
        this.description = description;
        this.account = account;
        this.amount = amount;
        this.category = category;
        this.date = new GregorianCalendar(1, 1, 1);
    }
    public Transaction(String name, String description, Account account, float amount,
                       GregorianCalendar date) {
        this.name = name;
        this.description = description;
        this.account = account;
        this.amount = amount;
        this.category = Categories.UNKNOWN;
        this.date = date;
    }

    public float getAmount() {
        float output = this.amount;
        if(this.category != Categories.INCOME && this.category != Categories.WITHDRAW) {
            output *= -1;
        }
        return output;
    }

    public String shortPrint() {
        String output = String.format("$%f | %s | %s", this.amount, this.name, this.category.name());
        return output;
    }


}
