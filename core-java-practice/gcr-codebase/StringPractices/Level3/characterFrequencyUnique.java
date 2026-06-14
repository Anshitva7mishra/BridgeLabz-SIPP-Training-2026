import java.util.Scanner;

public class characterFrequencyUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String[][] freq = findFrequencyUsingUnique(text);
        
        System.out.printf("%-10s | %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%-10s | %-10s%n", freq[i][0], freq[i][1]);
        }
        
        input.close();
    }
    
    public static char[] findUniqueCharacters(String str) {
        char[] temp = new char[str.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }
        
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
    
    public static String[][] findFrequencyUsingUnique(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }
}
