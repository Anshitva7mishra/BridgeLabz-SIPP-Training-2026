import java.util.Scanner;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        char[] unique = findUniqueCharacters(text);
        
        System.out.print("Unique characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i]);
        }
        System.out.println();
        
        input.close();
    }
    
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }
    
    public static char[] findUniqueCharacters(String str) {
        int len = getLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;
        
        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }
        
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}
