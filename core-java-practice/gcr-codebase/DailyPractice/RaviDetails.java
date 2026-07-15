/*
Ravi just joined a coding guild. Store his name, age, rank, salary, and
membership fee (float) using correct data types. Compute his
annual bonus (12% of salary), cast it to int, and print a formatted
welcome card.
*/

public class RaviDetails {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        int rank = 1;
        double salary = 50000;
        float membershipFee = 1000.0f;
        int annualBonus = (int) (salary * 0.12);
        System.out.println("Ravi's Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Annual Bonus: " + annualBonus);
    }
}
