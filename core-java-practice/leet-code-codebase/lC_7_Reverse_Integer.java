import java.util.Scanner;

public class lC_7_Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to reverse: ");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            lC_7_Reverse_Integer solver = new lC_7_Reverse_Integer();
            int result = solver.reverse(x);
            System.out.println("Reversed integer: " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }

    public int reverse(int x) {
        long ans = 0;
        boolean isNegative = false;
        
        // Handle Integer.MIN_VALUE safely since reversing it will overflow anyway
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        while (x != 0) {
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        if (isNegative) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        return (int) ans;
    }
}