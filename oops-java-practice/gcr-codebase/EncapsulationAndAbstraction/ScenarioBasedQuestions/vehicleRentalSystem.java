abstract class RentalVehicle {
    private String vehicleNumber;
    private String vehicleType;

    public RentalVehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber + " | Type: " + vehicleType + " | Days: " + days + " | Cost: $" + calculateRentalCost(days));
    }
}

class Car extends RentalVehicle {
    private double dailyRate;

    public Car(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Car");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends RentalVehicle {
    private double dailyRate;

    public Bike(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Bike");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends RentalVehicle {
    private double dailyRate;
    private double loadingCharge;

    public Truck(String vehicleNumber, double dailyRate, double loadingCharge) {
        super(vehicleNumber, "Truck");
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class vehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("CAR123", 50.0);
        Bike bike = new Bike("BIKE456", 20.0);
        Truck truck = new Truck("TRUCK789", 100.0, 150.0);

        int days = 5;
        car.displayDetails(days);
        bike.displayDetails(days);
        truck.displayDetails(days);
    }
}
