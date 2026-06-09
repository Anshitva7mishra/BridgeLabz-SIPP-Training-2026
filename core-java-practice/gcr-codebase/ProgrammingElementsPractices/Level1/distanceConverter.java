import java.util.Scanner;

public class distanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // 1 yard = 3 feet
        double yards = distanceInFeet / 3.0;
        
        // 1 mile = 1760 yards
        double miles = yards / 1760.0;
        
        System.out.println("The distance in yards is " + yards + " and miles is " + miles + " for the given distance of " + distanceInFeet + " feet");
        input.close();
    }
}
