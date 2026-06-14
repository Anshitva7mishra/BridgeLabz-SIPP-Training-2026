import java.util.Scanner;

public class wordLengths2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String[] words = splitWords(str);
        String[][] wordLengths = getWordLengths(words);
        
        System.out.printf("%-15s | %-10s%n", "Word", "Length");
        System.out.println("--------------------------------");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.printf("%-15s | %-10s%n", wordLengths[i][0], Integer.parseInt(wordLengths[i][1]));
        }
        
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
            if (str.charAt(i) == ' ') spaces++;
        }
        
        int[] spaceIndices = new int[spaces];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') spaceIndices[index++] = i;
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
    
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
}
