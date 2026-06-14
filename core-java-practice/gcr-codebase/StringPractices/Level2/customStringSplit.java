import java.util.Scanner;
import java.util.Arrays;

public class customStringSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String[] customSplit = splitWords(str);
        String[] builtInSplit = str.split(" ");
        
        boolean areEqual = compareArrays(customSplit, builtInSplit);
        System.out.println("Custom Split: " + Arrays.toString(customSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtInSplit));
        System.out.println("Are arrays equal? " + areEqual);
        
        input.close();
    }
    
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }
    
    public static String[] splitWords(String str) {
        int len = getLength(str);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        
        int[] spaceIndices = new int[spaces];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }
        
        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        int start = 0;
        for (int i = 0; i < spaces; i++) {
            String word = "";
            for (int j = start; j < spaceIndices[i]; j++) {
                word += str.charAt(j);
            }
            words[wordIndex++] = word;
            start = spaceIndices[i] + 1;
        }
        
        String lastWord = "";
        for (int j = start; j < len; j++) {
            lastWord += str.charAt(j);
        }
        words[wordIndex] = lastWord;
        
        return words;
    }
    
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }
}
