class Drone {
    private String droneId;
    private double batteryPercentage;
    public static String companyName = "FastDelivery Corp";

    public Drone(String droneId, double batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 10.0) {
            batteryPercentage -= 10.0;
            System.out.println("Drone " + droneId + " started delivery. Battery is now " + batteryPercentage + "%.");
        } else {
            System.out.println("Drone " + droneId + " cannot start delivery due to low battery (" + batteryPercentage + "%).");
        }
    }

    public void displayStatus() {
        System.out.println("Drone ID: " + droneId + ", Battery: " + batteryPercentage + "%, Company: " + companyName);
    }
}

public class droneDeliverySystem {
    public static void main(String[] args) {
        Drone d1 = new Drone("D01", 95.0);
        Drone d2 = new Drone("D02", 50.0);
        Drone d3 = new Drone("D03", 8.0);

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println("\nUpdating Company Name to 'ExpressDrones'...");
        Drone.companyName = "ExpressDrones";

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
