import java.util.Scanner;

public class chocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result[1] + ", Remaining chocolates: " + result[0]);
        input.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
        return new int[]{remainingChocolates, chocolatesPerChild};
    }
}
