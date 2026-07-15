class TollVehicle {
    private String vehicleNumber;
    private String ownerName;

    public TollVehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double calculateToll() {
        return 0.0;
    }
}

class TollCar extends TollVehicle {
    public TollCar(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 50.0;
    }
}

class TollBus extends TollVehicle {
    public TollBus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 150.0;
    }
}

class TollTruck extends TollVehicle {
    public TollTruck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return 250.0;
    }
}

public class smartVehicleToll {
    public static double calculateTotalRevenue(TollVehicle[] vehicles) {
        double total = 0;
        for (TollVehicle v : vehicles) {
            total += v.calculateToll();
        }
        return total;
    }

    public static void searchVehicle(TollVehicle[] vehicles, String vehicleNumber) {
        for (TollVehicle v : vehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {
                System.out.println("Vehicle Found: Number: " + v.getVehicleNumber() + " | Owner: " + v.getOwnerName() + " | Type: " + v.getClass().getSimpleName() + " | Toll: $" + v.calculateToll());
                return;
            }
        }
        System.out.println("Vehicle " + vehicleNumber + " not found.");
    }

    public static void displayHighestToll(TollVehicle[] vehicles) {
        TollVehicle highest = null;
        for (TollVehicle v : vehicles) {
            if (highest == null || v.calculateToll() > highest.calculateToll()) {
                highest = v;
            }
        }
        if (highest != null) {
            System.out.println("Highest Toll Paid by: " + highest.getOwnerName() + " (" + highest.getVehicleNumber() + ") | Amount: $" + highest.calculateToll());
        }
    }

    public static void countVehiclesByType(TollVehicle[] vehicles) {
        int cars = 0, buses = 0, trucks = 0;
        for (TollVehicle v : vehicles) {
            if (v instanceof TollCar) cars++;
            else if (v instanceof TollBus) buses++;
            else if (v instanceof TollTruck) trucks++;
        }
        System.out.println("Cars: " + cars + " | Buses: " + buses + " | Trucks: " + trucks);
    }

    public static void main(String[] args) {
        TollVehicle[] vehicles = new TollVehicle[5];
        vehicles[0] = new TollCar("MH12-100", "Alice");
        vehicles[1] = new TollBus("MH12-200", "Bob");
        vehicles[2] = new TollTruck("MH12-300", "Charlie");
        vehicles[3] = new TollCar("MH12-400", "David");
        vehicles[4] = new TollTruck("MH12-500", "Eva");

        System.out.println("Total Revenue: $" + calculateTotalRevenue(vehicles));
        displayHighestToll(vehicles);
        countVehiclesByType(vehicles);

        System.out.println("\nSearching for MH12-300:");
        searchVehicle(vehicles, "MH12-300");
    }
}
