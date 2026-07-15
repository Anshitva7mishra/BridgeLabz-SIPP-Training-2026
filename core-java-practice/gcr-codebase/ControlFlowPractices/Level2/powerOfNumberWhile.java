import java.util.Scanner;

public class powerOfNumberWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        if (number > 0 && power > 0) {
            long result = 1;
            int counter = 1;
            while (counter <= power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " to the power of " + power + " is " + result);
        } else {
            System.out.println("Please enter positive integers.");
        }
        
        input.close();
    }
}
