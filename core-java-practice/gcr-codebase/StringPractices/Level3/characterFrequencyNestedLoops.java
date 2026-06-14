import java.util.Scanner;

public class characterFrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String[] freq = findFrequency(text);
        
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i]);
        }
        
        input.close();
    }
    
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + frequency[i];
            }
        }
        
        return result;
    }
}
