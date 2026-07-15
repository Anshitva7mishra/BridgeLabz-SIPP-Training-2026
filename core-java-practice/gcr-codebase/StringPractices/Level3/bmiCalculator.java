import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }
        
        String[][] results = processBMI(personData);
        displayBMI(results);
        
        input.close();
    }
    
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status = "";
        
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        bmi = Math.round(bmi * 100.0) / 100.0;
        return new String[]{String.valueOf(bmi), status};
    }
    
    public static String[][] processBMI(double[][] personData) {
        String[][] results = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            String[] bmiData = calculateBMIAndStatus(personData[i][0], personData[i][1]);
            results[i][0] = String.valueOf(personData[i][1]);
            results[i][1] = String.valueOf(personData[i][0]);
            results[i][2] = bmiData[0];
            results[i][3] = bmiData[1];
        }
        return results;
    }
    
    public static void displayBMI(String[][] results) {
        System.out.printf("%-10s | %-10s | %-10s | %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s | %-10s | %-10s | %-15s%n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}
