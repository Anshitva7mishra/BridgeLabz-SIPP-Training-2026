import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
    }
}

public class areaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            Circle circle = new Circle(radius);
            circle.displayDetails();
        }
    }
}
