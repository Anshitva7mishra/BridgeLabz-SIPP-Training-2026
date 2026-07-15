import java.util.Scanner;

public class countdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a countdown value: ");
        int startValue = input.nextInt();
        
        for (int i = startValue; i >= 1; i--) {
            System.out.println(i);
        }
        
        input.close();
    }
}
