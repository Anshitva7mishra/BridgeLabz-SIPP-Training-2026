import java.util.Scanner;

public class IC_1281Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int result = subtractProductAndSum(n);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
