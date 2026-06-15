import java.util.Scanner;
import java.util.Arrays;

public class factorsAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.println(Arrays.toString(factors));
        System.out.println(findGreatestFactor(factors));
        System.out.println(sumOfFactors(factors));
        System.out.println(productOfFactors(factors));
        System.out.println(productOfCubeOfFactors(factors));
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
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
}
