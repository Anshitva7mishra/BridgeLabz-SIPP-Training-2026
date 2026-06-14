import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();
        
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        
        double result = 0;
        boolean validOperator = true;
        
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperator = false;
        }
        
        if (validOperator) {
            System.out.println("Result: " + result);
        }
        
        input.close();
    }
}
