import java.util.Scanner;

public class studentScorecard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);
        input.close();
    }

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (10 + Math.random() * 90);
            scores[i][1] = (int) (10 + Math.random() * 90);
            scores[i][2] = (int) (10 + Math.random() * 90);
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("Physics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}
