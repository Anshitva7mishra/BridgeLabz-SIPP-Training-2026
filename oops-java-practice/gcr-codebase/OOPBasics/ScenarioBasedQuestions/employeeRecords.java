class Staff {
    public String employeeID;
    protected String department;
    private double salary;

    public Staff(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
}

class Manager extends Staff {
    private double bonus;

    public Manager(String employeeID, String department, double salary, double bonus) {
        super(employeeID, department, salary);
        this.bonus = bonus;
    }

    public void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Bonus: " + bonus);
    }
}

public class employeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager("MGR501", "IT", 75000.0, 5000.0);
        mgr.displayManagerInfo();

        mgr.setSalary(80000.0);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
