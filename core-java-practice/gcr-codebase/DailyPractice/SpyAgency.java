import java.util.Scanner;

public class SpyAgency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a secret message: ");
        String message = input.nextLine();
        
        String reversed = reverseMessage(message);
        System.out.println("Reversed message: " + reversed);
        
        boolean isPalindrome = checkPalindrome(message);
        System.out.println("Is palindrome: " + isPalindrome);
        
        countVowelsConsonants(message);
        
        System.out.print("\nEnter first intercept to verify anagram: ");
        String intercept1 = input.nextLine();
        System.out.print("Enter second intercept to verify anagram: ");
        String intercept2 = input.nextLine();
        System.out.println("Are anagrams: " + checkAnagrams(intercept1, intercept2));
        
        System.out.print("\nEnter a surveillance log to find first non-repeating character: ");
        String log = input.nextLine();
        char nonRepeating = firstNonRepeatingCharacter(log);
        if (nonRepeating != '\0') {
            System.out.println("First non-repeating character: " + nonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        input.close();
    }
    
    public static String reverseMessage(String message) {
        char[] chars = message.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
    
    public static boolean checkPalindrome(String message) {
        int left = 0;
        int right = message.length() - 1;
        while (left < right) {
            if (message.charAt(left) != message.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void countVowelsConsonants(String message) {
        int vowels = 0;
        int consonants = 0;
        message = message.toLowerCase();
        
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
    public static boolean checkAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
    
    public static char firstNonRepeatingCharacter(String log) {
        int[] freq = new int[256];
        for (int i = 0; i < log.length(); i++) {
            freq[log.charAt(i)]++;
        }
        for (int i = 0; i < log.length(); i++) {
            if (freq[log.charAt(i)] == 1) {
                return log.charAt(i);
            }
        }
        return '\0';
    }
}
