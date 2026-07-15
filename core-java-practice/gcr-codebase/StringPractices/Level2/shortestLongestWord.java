import java.util.Scanner;

public class shortestLongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String[] words = splitWords(str);
        String[][] wordLengths = getWordLengths(words);
        int[] shortestLongest = findShortestLongest(wordLengths);
        
        System.out.println("Shortest word: " + wordLengths[shortestLongest[0]][0] + " (Length: " + wordLengths[shortestLongest[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[shortestLongest[1]][0] + " (Length: " + wordLengths[shortestLongest[1]][1] + ")");
        
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
    
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIdx = 0;
        int longestIdx = 0;
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = Integer.parseInt(wordLengths[0][1]);
        
        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                shortestIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }
}
