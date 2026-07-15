import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class lC_412_Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer n: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            lC_412_Fizz_Buzz solver = new lC_412_Fizz_Buzz();
            List<String> result = solver.fizzBuzz(n);
            System.out.println("FizzBuzz output: " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }

    public List<String> fizzBuzz(int n) {
        List<String> fAns = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String ans = checkRule(i + 1);
            fAns.add(ans);
        }
        return fAns;
    }

    public String checkRule(int idx) {
        if (idx % 3 == 0 && idx % 5 == 0)
            return "FizzBuzz";
        else if (idx % 3 == 0)
            return "Fizz";
        else if (idx % 5 == 0)
            return "Buzz";
        else
            return idx + "";
    }
}