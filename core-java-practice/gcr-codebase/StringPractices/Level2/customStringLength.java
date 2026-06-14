import java.util.Scanner;

public class customStringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        
        int customLen = getLength(str);
        int builtInLen = str.length();
        
        System.out.println("Custom length: " + customLen);
        System.out.println("Built-in length: " + builtInLen);
        
        input.close();
    }
    
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
}
