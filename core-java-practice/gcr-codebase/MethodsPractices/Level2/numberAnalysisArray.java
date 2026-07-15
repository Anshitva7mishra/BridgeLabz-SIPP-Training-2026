import java.util.Scanner;

public class numberAnalysisArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println("Positive");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        int cmp = compare(numbers[0], numbers[numbers.length - 1]);
        if (cmp == 1) System.out.println("Greater");
        else if (cmp == -1) System.out.println("Less");
        else System.out.println("Equal");
        input.close();
    }

    public static boolean isPositive(int number) {
        return number >= 0; 
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }
}
