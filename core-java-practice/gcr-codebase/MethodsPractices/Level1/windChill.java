import java.util.Scanner;

public class windChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();
        windChill wc = new windChill();
        System.out.println(wc.calculateWindChill(temperature, windSpeed));
        input.close();
    }

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
}
