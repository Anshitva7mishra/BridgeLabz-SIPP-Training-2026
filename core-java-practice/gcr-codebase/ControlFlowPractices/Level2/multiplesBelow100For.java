import java.util.Scanner;

public class multiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                    continue;
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
        
        input.close();
    }
}
