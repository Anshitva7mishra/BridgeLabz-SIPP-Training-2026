import java.util.Scanner;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class mobilePhoneDetails {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter Model: ");
            String model = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            MobilePhone phone = new MobilePhone(brand, model, price);
            System.out.println("\nMobile Phone Details:");
            phone.displayDetails();
        }
    }
}
