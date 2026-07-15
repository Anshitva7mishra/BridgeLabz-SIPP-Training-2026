import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();
        
        System.out.println("Logic 1 (Iteration): " + checkPalindromeLogic1(text));
        System.out.println("Logic 2 (Recursion): " + checkPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Array Reversal): " + checkPalindromeLogic3(text));
        
        input.close();
    }
    
    public static boolean checkPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static boolean checkPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeLogic2(text, start + 1, end - 1);
    }
    
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
    
    public static boolean checkPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}
