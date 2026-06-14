import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n > 0) {
            long factorial = 1;
            int counter = 1;
            while (counter <= n) {
                factorial *= counter;
                counter++;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        input.close();
    }
}
