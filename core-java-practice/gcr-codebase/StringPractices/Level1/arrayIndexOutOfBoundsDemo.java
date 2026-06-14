import java.util.Scanner;

public class arrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = input.next();
        }
        
        handleException(names);
        
        input.close();
    }
    
    
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
