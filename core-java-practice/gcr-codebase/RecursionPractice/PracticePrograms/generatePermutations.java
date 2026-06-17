import java.util.Scanner;

public class generatePermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        permute(str, "");
        input.close();
    }

    public static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            permute(rem, prefix + ch);
        }
    }
}
