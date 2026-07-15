abstract class SystemBankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public SystemBankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + " | Holder: " + holderName + " | Balance: $" + balance);
    }
}

class SystemSavingsAccount extends SystemBankAccount {
    private double interestRate;

    public SystemSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }
}

class SystemCurrentAccount extends SystemBankAccount {
    private double monthlyBonusRate;

    public SystemCurrentAccount(String accountNumber, String holderName, double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100.0;
    }
}

public class bankingSystem {
    public static void main(String[] args) {
        SystemSavingsAccount savings = new SystemSavingsAccount("SAV123", "John Doe", 1000.0, 4.5);
        SystemCurrentAccount current = new SystemCurrentAccount("CUR456", "Jane Smith", 2000.0, 1.5);

        savings.deposit(500.0);
        savings.withdraw(200.0);
        savings.displayAccountDetails();
        System.out.println("Calculated Interest: $" + savings.calculateInterest());

        current.deposit(1000.0);
        current.withdraw(500.0);
        current.displayAccountDetails();
        System.out.println("Calculated Interest: $" + current.calculateInterest());
    }
}
