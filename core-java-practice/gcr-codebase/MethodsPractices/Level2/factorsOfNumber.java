import java.util.Scanner;
import java.util.Arrays;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.println(Arrays.toString(factors));
        System.out.println(sumOfFactors(factors));
        System.out.println(productOfFactors(factors));
        System.out.println(sumOfSquareOfFactors(factors));
        input.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    public static double sumOfSquareOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }
}
