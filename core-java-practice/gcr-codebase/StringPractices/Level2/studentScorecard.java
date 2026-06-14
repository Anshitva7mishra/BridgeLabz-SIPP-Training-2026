import java.util.Scanner;

public class studentScorecard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);
        
        displayScorecard(scores, stats, grades);
        
        input.close();
    }
    
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return scores;
    }
    
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    
    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.printf("%-10s | %-8s | %-10s | %-8s | %-8s | %-10s | %-12s | %-6s%n", 
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d | %-8d | %-10d | %-8d | %-8.2f | %-10.2f | %-12.2f | %-6s%n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                stats[i][0], stats[i][1], stats[i][2], grades[i][0]);
        }
    }
}
