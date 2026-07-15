class ParkingVehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public ParkingVehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }

    public static void displayCars(ParkingVehicle[] vehicles) {
        System.out.println("\n--- CARS ---");
        for (ParkingVehicle v : vehicles) {
            if (v != null && v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(ParkingVehicle[] vehicles) {
        System.out.println("\n--- BIKES ---");
        for (ParkingVehicle v : vehicles) {
            if (v != null && v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }
}

public class smartParkingManagement {
    public static void main(String[] args) {
        ParkingVehicle[] vehicles = new ParkingVehicle[10];
        vehicles[0] = new ParkingVehicle("MH12AB1234", "Amit", "Car");
        vehicles[1] = new ParkingVehicle("MH12CD5678", "Neha", "Bike");
        vehicles[2] = new ParkingVehicle("KA51XY9876", "Rahul", "Car");
        vehicles[3] = new ParkingVehicle("DL3CZZ1111", "Priya", "Car");
        vehicles[4] = new ParkingVehicle("HR26AA2222", "Vikram", "Bike");
        vehicles[5] = new ParkingVehicle("MH02EF3333", "Rohan", "Bike");
        vehicles[6] = new ParkingVehicle("KA03GH4444", "Sneha", "Car");
        vehicles[7] = new ParkingVehicle("GJ01JK5555", "Raj", "Car");
        vehicles[8] = new ParkingVehicle("UP16LM6666", "Aditya", "Bike");
        vehicles[9] = new ParkingVehicle("TN07NP7777", "Divya", "Car");

        ParkingVehicle.displayCars(vehicles);
        ParkingVehicle.displayBikes(vehicles);
    }
}
