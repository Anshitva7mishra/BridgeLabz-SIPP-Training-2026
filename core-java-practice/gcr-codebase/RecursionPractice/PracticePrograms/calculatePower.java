import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println(power(x, n));
        input.close();
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
