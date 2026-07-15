import java.util.InputMismatchException;
import java.util.Scanner;

public class uncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num1 = input.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }
        input.close();
    }
}
