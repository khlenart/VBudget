public class Main {
    public static void main(String[] args) {
        Account checking = new Account();
        AccountManager manager = new AccountManager(checking);
        manager.mainMenu();
    }
}