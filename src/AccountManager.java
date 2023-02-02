import java.util.GregorianCalendar;
import java.util.Scanner;

public class AccountManager {

    private Account currentAccount;
    private Scanner input = new Scanner(System.in);

    public AccountManager(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public void mainMenu() {
        System.out.println("Menu in Progress -> Going to add Charge");
        this.createTransaction();
    }

    /*
        private String name;
    private String description;
    private Account account;
    private float amount;
    private Categories category;
    private Date date;
     */

    private Transaction createTransaction() {
        // Category
        System.out.print("Please enter the category: ");
        String inString = input.nextLine();
        Categories category = getCat(inString);

        // Amount
        System.out.print("Please enter the amount: ");
        float amount = input.nextFloat();

        // Name
        System.out.print("Please enter a title: ");
        String name = input.nextLine();

        // Desc
        System.out.print("Please enter a description: ");
        String desc = input.nextLine();

        // Date
        System.out.print("Please enter the Month of Transaction: ");
        int month = input.nextInt();
        System.out.print("Please enter the Day of Transaction: ");
        int day = input.nextInt();
        System.out.print("Please enter the Year of Transaction: ");
        int year = input.nextInt();
        GregorianCalendar date = new GregorianCalendar(year, month, day);

        Transaction toAdd = new Transaction(name, desc, this.currentAccount, amount, category, date);
        this.currentAccount.charge(toAdd);
        System.out.println(toAdd.shortPrint());
        return toAdd;
    }

    private Categories getCat(String category) {
        if (category.toUpperCase().equals("INCOME")) {
            return Categories.INCOME;
        }
        else {
            return Categories.UNKNOWN;
        }
    }

}
