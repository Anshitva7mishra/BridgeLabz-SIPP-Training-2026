abstract class FleetVehicle {
    public abstract double fuelCost(double km);
}

class Car extends FleetVehicle {
    @Override
    public double fuelCost(double km) {
        return km * 5.0;
    }
}

class Bus extends FleetVehicle {
    @Override
    public double fuelCost(double km) {
        return km * 15.0;
    }
}

class Bike extends FleetVehicle {
    @Override
    public double fuelCost(double km) {
        return km * 2.5;
    }
}

class ElectricCar extends FleetVehicle {
    @Override
    public double fuelCost(double km) {
        return km * 1.0;
    }

    public void displayBatteryStatus() {
        System.out.println("ElectricCar: Battery is healthy.");
    }
}

public class fleetManagement {
    public static void main(String[] args) {
        FleetVehicle[] fleet = new FleetVehicle[4];
        fleet[0] = new Car();
        fleet[1] = new Bus();
        fleet[2] = new Bike();
        fleet[3] = new ElectricCar();

        double distance = 100.0;
        for (FleetVehicle v : fleet) {
            System.out.println("Type: " + v.getClass().getSimpleName() + " | Fuel Cost for " + distance + " km: $" + v.fuelCost(distance));
            if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                ec.displayBatteryStatus();
            }
        }
    }
}
