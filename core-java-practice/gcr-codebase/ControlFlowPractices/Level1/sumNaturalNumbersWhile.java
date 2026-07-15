import java.util.Scanner;

public class sumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            
            int whileSum = 0;
            int counter = 1;
            while (counter <= n) {
                whileSum += counter;
                counter++;
            }
            
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Sum using formula: " + formulaSum);
            
            if (whileSum == formulaSum) {
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
