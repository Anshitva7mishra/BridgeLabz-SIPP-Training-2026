import java.util.Scanner;

public class intOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;
        
        System.out.println("The results of Int Operations are a + b * c = " + op1 + 
                           ", a * b + c = " + op2 + 
                           ", c + a / b = " + op3 + 
                           ", and a % b + c = " + op4);
        input.close();
    }
}
