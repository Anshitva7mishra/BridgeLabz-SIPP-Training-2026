import java.util.Scanner;

public class usernameValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.next();
        System.out.println(isValidUsername(username, 0));
        input.close();
    }

    public static boolean isValidUsername(String str, int index) {
        if (index == str.length()) {
            return true;
        }
        char ch = str.charAt(index);
        if (ch < 'a' || ch > 'z') {
            return false;
        }
        return isValidUsername(str, index + 1);
    }
}
