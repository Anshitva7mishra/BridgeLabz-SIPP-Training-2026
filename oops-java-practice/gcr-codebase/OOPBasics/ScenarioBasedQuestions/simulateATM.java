import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class simulateATM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Account Holder Name: ");
            String holder = sc.nextLine();
            System.out.print("Enter Account Number: ");
            String accNum = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double initialBalance = sc.nextDouble();

            BankAccount account = new BankAccount(holder, accNum, initialBalance);

            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                if (choice == 4) break;

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depAmt = sc.nextDouble();
                        account.deposit(depAmt);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double witAmt = sc.nextDouble();
                        account.withdraw(witAmt);
                        break;
                    case 3:
                        account.displayBalance();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
