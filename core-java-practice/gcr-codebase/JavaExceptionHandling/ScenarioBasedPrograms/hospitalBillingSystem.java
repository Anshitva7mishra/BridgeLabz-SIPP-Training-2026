import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class hospitalBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] patients = {"Alice", "Bob", "Charlie"};
        int[] bills = {1000, 2000, 3000};
        int[] items = {5, 0, 10};

        try {
            System.out.print("Enter patient index: ");
            String indexInput = input.nextLine();
            int index = Integer.parseInt(indexInput);
            
            System.out.println("Patient: " + patients[index]);
            
            int costPerItem = bills[index] / items[index];
            System.out.println("Cost per item: " + costPerItem);
            
            System.out.print("Enter payment amount: ");
            double payment = input.nextDouble();
            
            if (payment < bills[index]) {
                throw new InsufficientFundsException("Payment failed. Shortfall: " + (bills[index] - payment));
            }
            
            System.out.println("Payment successful. Change: " + (payment - bills[index]));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index! No such patient found.");
        } catch (ArithmeticException e) {
            System.out.println("Calculation error! Bill contains zero items.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
