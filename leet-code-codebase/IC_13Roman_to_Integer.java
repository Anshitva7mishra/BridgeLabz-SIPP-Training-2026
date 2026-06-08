import java.util.Scanner;

public class IC_13Roman_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String s = sc.nextLine().trim().toUpperCase();

        IC_13Roman_to_Integer solver = new IC_13Roman_to_Integer();
        int num = solver.romanToInt(s);

        System.out.println("Integer value: " + num);
        sc.close();
    }

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            if (i + 1 < s.length() && getValue(s.charAt(i + 1)) > current) {
                num -= current;
            } else {
                num += current;
            }
        }
        return num;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
