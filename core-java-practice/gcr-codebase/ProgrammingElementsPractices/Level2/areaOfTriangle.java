import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();
        
        double areaSqCm = 0.5 * base * height;
        
        // 1 inch = 2.54 cm => 1 sq inch = 2.54 * 2.54 = 6.4516 sq cm
        double areaSqIn = areaSqCm / 6.4516;
        
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        input.close();
    }
}
