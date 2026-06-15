import java.util.Scanner;

public class sumOfNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int recursiveSum = findSumRecursive(n);
            int formulaSum = findSumFormula(n);
            System.out.println(recursiveSum);
            System.out.println(formulaSum);
            System.out.println(recursiveSum == formulaSum);
        }
        input.close();
    }

    public static int findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
