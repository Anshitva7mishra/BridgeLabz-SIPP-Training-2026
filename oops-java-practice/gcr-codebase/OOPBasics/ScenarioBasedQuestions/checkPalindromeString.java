import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        if (text == null) return false;
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class checkPalindromeString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string to check: ");
            String input = sc.nextLine();

            PalindromeChecker checker = new PalindromeChecker(input);
            checker.displayResult();
        }
    }
}
