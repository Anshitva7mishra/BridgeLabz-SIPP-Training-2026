import java.util.Scanner;

public class studentVoteChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        studentVoteChecker checker = new studentVoteChecker();
        for (int i = 0; i < 10; i++) {
            ages[i] = input.nextInt();
            System.out.println(checker.canStudentVote(ages[i]));
        }
        input.close();
    }

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}
