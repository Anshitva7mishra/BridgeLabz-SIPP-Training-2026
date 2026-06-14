import java.util.Scanner;

public class bmiCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();
        
        double[][] personData = new double[number][3]; // weight, height, BMI
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = input.nextDouble();
            
            if (weight < 0 || height < 0) {
                System.out.println("Please enter positive values.");
                i--;
                continue;
            }
            
            personData[i][0] = weight;
            personData[i][1] = height;
            
            double heightM = height / 100.0;
            personData[i][2] = weight / (heightM * heightM);
            
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nBMI Report:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][1] + "cm, Weight: " + personData[i][0] + "kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
        
        input.close();
    }
}
