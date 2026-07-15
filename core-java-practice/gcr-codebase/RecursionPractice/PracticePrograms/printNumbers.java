import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        printNTo1(n);
        System.out.println();
        input.close();
    }

    public static void printNTo1(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
