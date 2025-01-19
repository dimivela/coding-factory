package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, "GR420200056365", "Alice", "Brooke", "S123", 1000.0);

        try {
            account.deposit(900);
            System.out.println("The deposit was successful.");

            account.withdraw(500.0, "R123");

            account.withdraw(200.0, "S123");
            System.out.println("The withdraw was successful.");

            System.out.println("Balance: " + account.getAccountBalance());

            System.out.println(account.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
