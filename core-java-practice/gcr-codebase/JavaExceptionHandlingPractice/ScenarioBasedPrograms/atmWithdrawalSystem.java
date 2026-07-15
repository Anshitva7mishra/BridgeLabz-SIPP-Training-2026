import java.util.Scanner;

class AtmInsufficientBalanceException extends Exception {
    private double currentBalance;
    private double withdrawalAmount;

    public AtmInsufficientBalanceException(String message, double currentBalance, double withdrawalAmount) {
        super(message);
        this.currentBalance = currentBalance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

public class atmWithdrawalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 5000.0;

        System.out.print("Enter withdrawal amount: ");
        double request = input.nextDouble();

        try {
            processWithdrawal(balance, request);
        } catch (AtmInsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Current Balance: " + e.getCurrentBalance());
            System.out.println("Attempted Withdrawal: " + e.getWithdrawalAmount());
        }
        input.close();
    }

    public static void processWithdrawal(double balance, double request) throws AtmInsufficientBalanceException {
        if (request > balance) {
            throw new AtmInsufficientBalanceException("Transaction failed due to insufficient funds.", balance, request);
        }
        System.out.println("Withdrawal successful. New balance: " + (balance - request));
    }
}
