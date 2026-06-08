import java.util.Scanner;

public class lC_9Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            String num = "" + x;
            int lPtr = 0;
            int rPtr = num.length() - 1;
            boolean isPalindrome = true;
            while (lPtr <= rPtr) {
                if (num.charAt(lPtr) != num.charAt(rPtr)) {
                    isPalindrome = false;
                    break;
                }
                lPtr++;
                rPtr--;
            }
            System.out.println("Is palindrome: " + isPalindrome);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }
}