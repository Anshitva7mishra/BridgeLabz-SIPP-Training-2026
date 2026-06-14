import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        int count = 0;
        int temp = number;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        
        System.out.println("The number of digits is: " + count);
        
        input.close();
    }
}
