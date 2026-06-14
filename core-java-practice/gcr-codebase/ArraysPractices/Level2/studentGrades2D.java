import java.util.Scanner;

public class studentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        
        double[][] marks = new double[number][3]; // physics, chemistry, maths
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter Physics marks: ");
            double p = input.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            double c = input.nextDouble();
            System.out.print("Enter Maths marks: ");
            double m = input.nextDouble();
            
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Please enter positive values.");
                i--;
                continue;
            }
            
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            
            percentages[i] = (p + c + m) / 3.0;
            
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70 && percentages[i] <= 79.99) {
                grades[i] = "B";
            } else if (percentages[i] >= 60 && percentages[i] <= 69.99) {
                grades[i] = "C";
            } else if (percentages[i] >= 50 && percentages[i] <= 59.99) {
                grades[i] = "D";
            } else if (percentages[i] >= 40 && percentages[i] <= 49.99) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " - Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] + ", Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
        }
        
        input.close();
    }
}
