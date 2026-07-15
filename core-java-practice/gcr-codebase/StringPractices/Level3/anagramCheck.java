import java.util.Scanner;

public class anagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = input.next();
        System.out.print("Enter second string: ");
        String text2 = input.next();
        
        boolean isAnagram = checkAnagrams(text1, text2);
        System.out.println("Are the strings anagrams? " + isAnagram);
        
        input.close();
    }
    
    public static boolean checkAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }
}
