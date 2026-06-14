import java.util.Scanner;

public class characterType2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String[][] charTypes = findCharacterTypes(str);
        displayCharacterTypes(charTypes);
        
        input.close();
    }
    
    public static String checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }
    
    public static String[][] findCharacterTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacter(str.charAt(i));
        }
        return result;
    }
    
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.printf("%-10s | %-15s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (int i = 0; i < charTypes.length; i++) {
            System.out.printf("%-10s | %-15s%n", charTypes[i][0], charTypes[i][1]);
        }
    }
}
