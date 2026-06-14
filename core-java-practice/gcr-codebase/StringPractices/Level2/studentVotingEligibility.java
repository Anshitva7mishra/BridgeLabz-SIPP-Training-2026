import java.util.Scanner;

public class studentVotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        
        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);
        displayVotingEligibility(eligibility);
        
        input.close();
    }
    
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "True (Can Vote)";
            } else {
                result[i][1] = "False (Cannot Vote)";
            }
        }
        return result;
    }
    
    public static void displayVotingEligibility(String[][] eligibility) {
        System.out.printf("%-10s | %-20s%n", "Age", "Eligibility");
        System.out.println("--------------------------------");
        for (int i = 0; i < eligibility.length; i++) {
            System.out.printf("%-10s | %-20s%n", eligibility[i][0], eligibility[i][1]);
        }
    }
}
