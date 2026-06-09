import java.util.Scanner;

public class doubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();
        
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
        
        System.out.println("The results of Double Operations are a + b * c = " + op1 + 
                           ", a * b + c = " + op2 + 
                           ", c + a / b = " + op3 + 
                           ", and a % b + c = " + op4);
        input.close();
    }
}
