import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();
        
        double totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;
        
        String grade = "";
        String remarks = "";
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70 && percentage <= 79.99) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage <= 69.99) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage <= 59.99) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage <= 49.99) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        System.out.println("Average Mark (Percentage): " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        input.close();
    }
}
