import java.util.Scanner;

public class quotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divisor = input.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[1] + ", Remainder: " + result[0]);
        input.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }
}
