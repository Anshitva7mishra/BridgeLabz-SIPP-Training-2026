class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double pricePerDay;

    public CarRental(String customerName, String carModel, int rentalDays, double pricePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    public double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class carRentalSystem {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Charlie", "Tesla Model 3", 5, 80.0);
        rental.displayDetails();
    }
}
