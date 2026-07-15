import java.util.Scanner;

public class multiplicationTableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] results = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            results[i - 1] = number * i;
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 1]);
        }
        
        input.close();
    }
}
