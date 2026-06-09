import java.util.Scanner;

public class lC_1342Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            lC_1342Number_of_Steps_to_Reduce_a_Number_to_Zero solver = new lC_1342Number_of_Steps_to_Reduce_a_Number_to_Zero();
            int steps = solver.numberOfSteps(num);
            System.out.println("Number of steps to reduce to zero: " + steps);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (checkEven(num)) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }

    public boolean checkEven(int val) {
        return (val % 2 == 0) ? true : false;
    }
}