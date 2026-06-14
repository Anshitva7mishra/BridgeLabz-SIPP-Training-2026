import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = Math.abs(number);
        int count = 0;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }
        
        int[] digits = new int[count];
        temp = Math.abs(number);
        
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }
        
        System.out.print("Reversed digits: ");
        if (number < 0) {
            System.out.print("-");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();
        
        input.close();
    }
}
