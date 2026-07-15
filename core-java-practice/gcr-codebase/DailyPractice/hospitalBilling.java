class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class hospitalBilling {
    public static void main(String[] args) {
        processBilling(0, 10);
        processPatient("invalid", 5);
        try {
            processPayment(50, 100);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void processBilling(int items, int totalBill) {
        try {
            int averageCost = totalBill / items;
            System.out.println(averageCost);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average cost: zero items provided.");
        }
    }

    public static void processPatient(String input, int index) {
        String[] patients = {"John", "Jane", "Doe"};
        try {
            int val = Integer.parseInt(input);
            System.out.println(val);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter a valid number.");
        }
        try {
            System.out.println(patients[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index. Patient does not exist.");
        }
    }

    public static void processPayment(double payment, double bill) throws InsufficientFundsException {
        if (payment < bill) {
            throw new InsufficientFundsException("Payment failure: Insufficient funds provided.");
        }
        System.out.println("Payment successful.");
    }
}
