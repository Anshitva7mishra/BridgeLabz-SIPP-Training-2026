import java.util.Scanner;

public class customTrim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str = input.nextLine();
        
        int[] indices = getTrimIndices(str);
        String customTrimmed = createSubstring(str, indices[0], indices[1]);
        String builtInTrimmed = str.trim();
        
        System.out.println("Custom trim: '" + customTrimmed + "'");
        System.out.println("Built-in trim: '" + builtInTrimmed + "'");
        System.out.println("Are they equal? " + compare(customTrimmed, builtInTrimmed));
        
        input.close();
    }
    
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        if (start > end) {
            return new int[]{0, 0};
        }
        return new int[]{start, end + 1};
    }
    
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
