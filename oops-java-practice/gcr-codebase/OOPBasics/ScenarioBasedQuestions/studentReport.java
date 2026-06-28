import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else if (marks >= 50) return "E";
        else return "F";
    }

    public void displayReport() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class studentReport {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student student = new Student(name, rollNumber, marks);
            System.out.println("\nStudent Report:");
            student.displayReport();
        }
    }
}
