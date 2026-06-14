import java.util.Scanner;

public class calculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        
        double heightMeters = heightCm / 100.0;
        double bmi = weight / (heightMeters * heightMeters);
        
        String status = "";
        
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else if (bmi >= 40.0) {
            status = "Obese";
        }
        
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);
        
        input.close();
    }
}
