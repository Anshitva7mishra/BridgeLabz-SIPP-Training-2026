import java.util.Scanner;

public class fizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if (number > 0) {
            String[] results = new String[number + 1];
            
            for (int i = 0; i <= number; i++) {
                if (i > 0 && i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i > 0 && i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i > 0 && i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }
            
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        input.close();
    }
}
