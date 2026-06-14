import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter citizen's income: ");
        double income = input.nextDouble();
        
        calculateAndPrintTax(income);
        
        System.out.println("\n--- Extending for 10 citizens ---");
        double[] citizenIncomes = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income for citizen " + (i + 1) + ": ");
            citizenIncomes[i] = input.nextDouble();
        }
        
        double totalTaxCollected = 0;
        for (int i = 0; i < 10; i++) {
            totalTaxCollected += calculateTaxAmount(citizenIncomes[i]);
        }
        System.out.println("Total tax collected from 10 citizens: " + totalTaxCollected);
        
        input.close();
    }
    
    public static void calculateAndPrintTax(double income) {
        double tax = 0;
        String bracket = "";
        
        if (income < 10000) {
            tax = income * 0.05;
            bracket = "5%";
        } else if (income <= 50000) {
            tax = income * 0.15;
            bracket = "15%";
        } else {
            tax = income * 0.30;
            bracket = "30%";
        }
        
        System.out.println("Tax bracket: " + bracket);
        System.out.println("Tax amount: " + tax);
    }
    
    public static double calculateTaxAmount(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }
}
