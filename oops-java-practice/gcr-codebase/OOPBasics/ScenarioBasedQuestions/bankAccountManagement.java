class Account {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class bankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA98765", "Bob Smith", 5000.0, 3.5);
        sa.displayAccountInfo();

        sa.setBalance(5500.0);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
