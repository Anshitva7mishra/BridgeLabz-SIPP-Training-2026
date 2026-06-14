import java.util.Scanner;

public class stringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        handleException(str);
        
        input.close();
    }
    
    
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
