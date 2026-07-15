import java.util.Scanner;
import java.util.Arrays;

public class lC_66_Plus_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits separated by spaces (e.g. 1 2 3): ");
        String line = sc.nextLine().trim();
        if (!line.isEmpty()) {
            String[] tokens = line.split("\\s+");
            int[] digits = new int[tokens.length];
            boolean valid = true;
            for (int i = 0; i < tokens.length; i++) {
                try {
                    digits[i] = Integer.parseInt(tokens[i]);
                } catch (NumberFormatException e) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                lC_66_Plus_One solver = new lC_66_Plus_One();
                int[] result = solver.plusOne(digits);
                System.out.println("Result: " + Arrays.toString(result));
            } else {
                System.out.println("Invalid input. Please enter space-separated digits.");
            }
        } else {
            System.out.println("Input cannot be empty.");
        }
        sc.close();
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}