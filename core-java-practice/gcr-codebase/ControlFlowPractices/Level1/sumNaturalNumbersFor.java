import java.util.Scanner;

public class sumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }
            
            System.out.println("Sum using for loop: " + forSum);
            System.out.println("Sum using formula: " + formulaSum);
            
            if (forSum == formulaSum) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("Computations do not match.");
            }
        } else {
            System.out.println("The number entered is not a natural number.");
        }
        
        input.close();
    }
}
