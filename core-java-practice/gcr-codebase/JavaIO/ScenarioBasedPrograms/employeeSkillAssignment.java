import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int employeeId;
    String name;
    String department;
    double salary;

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nSalary: " + salary;
    }
}

public class employeeSkillAssignment {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(employeeId, name, department, salary);
            String filename = "employee.ser";

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
                out.writeObject(employee);
            }

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                Employee restored = (Employee) in.readObject();
                System.out.println("\nRecovered Employee Information:");
                System.out.println(restored);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
