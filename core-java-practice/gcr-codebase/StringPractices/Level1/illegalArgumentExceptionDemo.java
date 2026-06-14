import java.util.Scanner;

public class illegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        handleException(str);
        
        input.close();
    }
    
    
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
