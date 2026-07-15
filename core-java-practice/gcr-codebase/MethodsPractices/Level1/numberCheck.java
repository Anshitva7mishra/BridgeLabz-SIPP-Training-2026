import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(checkNumber(number));
        input.close();
    }

    public static int checkNumber(int number) {
        if (number < 0) return -1;
        if (number > 0) return 1;
        return 0;
    }
}
