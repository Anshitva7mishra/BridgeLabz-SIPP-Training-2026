import java.util.Scanner;

public class calculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        sc.close();
        System.out.printf("Average = %.2f%n", average);
    }
}
