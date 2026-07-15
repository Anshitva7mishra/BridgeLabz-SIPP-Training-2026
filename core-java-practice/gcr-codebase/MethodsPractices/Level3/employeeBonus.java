public class employeeBonus {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] newSalaryData = calculateNewSalaryAndBonus(employeeData);
        displayTabularFormat(employeeData, newSalaryData);
    }

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = Math.random() * 15;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void displayTabularFormat(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Old Salary | Years | New Salary | Bonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f | %.1f | %.2f | %.2f\n", oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
            sumOldSalary += oldData[i][0];
            sumNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }
        System.out.println("Sum Old Salary: " + sumOldSalary);
        System.out.println("Sum New Salary: " + sumNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }
}
