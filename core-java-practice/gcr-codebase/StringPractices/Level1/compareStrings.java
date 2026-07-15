import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.next();
        System.out.print("Enter second string: ");
        String s2 = input.next();
        
        boolean customResult = compare(s1, s2);
        boolean builtInResult = s1.equals(s2);
        
        System.out.println("Custom compare result: " + customResult);
        System.out.println("Built-in compare result: " + builtInResult);
        
        input.close();
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
