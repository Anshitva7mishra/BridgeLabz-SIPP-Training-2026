import java.util.Scanner;

public class characterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        
        char[] customArray = getChars(str);
        char[] builtInArray = str.toCharArray();
        
        boolean areEqual = compareArrays(customArray, builtInArray);
        
        System.out.println("Are the character arrays equal? " + areEqual);
        
        input.close();
    }
    
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    
    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
