import java.util.ArrayList;
import java.util.List;

class TransactionBankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;
    private List<String> transactions = new ArrayList<>();
    private double overdraftLimit = 500.0;

    public TransactionBankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
        transactions.add("Account created with initial balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + " | Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                transactions.add("Withdrew: " + amount + " | Balance: " + balance);
            } else {
                transactions.add("Withdrawal of " + amount + " failed due to overdraft limit.");
            }
        }
    }

    public void getStatement() {
        System.out.println("\nStatement for Account: " + accountNumber + " (" + holder + ")");
        for (String tx : transactions) {
            System.out.println("- " + tx);
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class bankAccountTransaction {
    public static void main(String[] args) {
        TransactionBankAccount acc1 = new TransactionBankAccount("ACC01", "Alice", 1000.0);
        TransactionBankAccount acc2 = new TransactionBankAccount("ACC02", "Bob", 2000.0);
        TransactionBankAccount acc3 = new TransactionBankAccount("ACC03", "Charlie", 500.0);

        acc1.deposit(200.0);
        acc1.withdraw(500.0);
        acc1.deposit(100.0);
        acc1.withdraw(1200.0);
        acc1.withdraw(200.0);

        acc2.withdraw(1000.0);
        acc2.deposit(500.0);
        acc2.withdraw(2000.0);
        acc2.deposit(100.0);
        acc2.withdraw(200.0);

        acc3.deposit(500.0);
        acc3.withdraw(200.0);
        acc3.withdraw(700.0);
        acc3.deposit(300.0);
        acc3.withdraw(600.0);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal accounts created: " + TransactionBankAccount.getTotalAccounts());
    }
}
