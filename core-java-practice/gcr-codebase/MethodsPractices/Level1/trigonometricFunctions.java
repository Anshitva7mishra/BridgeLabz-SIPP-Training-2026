import java.util.Scanner;

public class trigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle = input.nextDouble();
        trigonometricFunctions tf = new trigonometricFunctions();
        double[] results = tf.calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        input.close();
    }

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
}
