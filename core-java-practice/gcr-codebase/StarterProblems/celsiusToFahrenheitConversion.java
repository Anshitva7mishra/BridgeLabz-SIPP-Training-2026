import java.util.Scanner;

public class celsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}
