import java.util.Scanner;

public class characterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String[][] freq = findFrequency(text);
        
        System.out.printf("%-10s | %-10s%n", "Character", "Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%-10s | %-10s%n", freq[i][0], freq[i][1]);
        }
        
        input.close();
    }
    
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean isFirst = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isFirst = false;
                    break;
                }
            }
            if (isFirst) uniqueCount++;
        }
        
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean isFirst = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isFirst = false;
                    break;
                }
            }
            if (isFirst) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(frequency[text.charAt(i)]);
                index++;
            }
        }
        
        return result;
    }
}
