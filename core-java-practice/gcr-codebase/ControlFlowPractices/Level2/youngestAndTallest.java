import java.util.Scanner;

public class youngestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightAmar = input.nextDouble();
        
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = input.nextDouble();
        
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = input.nextDouble();
        
        // Find youngest
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.print("The youngest friend is: ");
        if (minAge == ageAmar) System.out.print("Amar ");
        if (minAge == ageAkbar) System.out.print("Akbar ");
        if (minAge == ageAnthony) System.out.print("Anthony");
        System.out.println(" with age " + minAge);
        
        // Find tallest
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.print("The tallest friend is: ");
        if (maxHeight == heightAmar) System.out.print("Amar ");
        if (maxHeight == heightAkbar) System.out.print("Akbar ");
        if (maxHeight == heightAnthony) System.out.print("Anthony");
        System.out.println(" with height " + maxHeight);
        
        input.close();
    }
}
