import java.util.Scanner;

public class convertKilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        sc.close();
        System.out.printf("%.4f%n", miles);
    }
}
