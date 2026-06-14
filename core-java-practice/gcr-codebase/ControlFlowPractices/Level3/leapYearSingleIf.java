import java.util.Scanner;

public class leapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
        
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The Year is a Leap Year");
            } else {
                System.out.println("The Year is not a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }
        
        input.close();
    }
}
