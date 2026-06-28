class ChargingStation {
    public static int totalStations = 0;
    public static double electricityRate = 0.15;
    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId + " | Units Consumed: " + unitsConsumed + " | Bill: $" + calculateBill());
    }
}

public class electricVehicleChargingNetwork {
    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation("ST01", 120.0);
        ChargingStation s2 = new ChargingStation("ST02", 250.5);
        ChargingStation s3 = new ChargingStation("ST03", 85.0);
        ChargingStation s4 = new ChargingStation("ST04", 400.0);
        ChargingStation s5 = new ChargingStation("ST05", 150.2);

        System.out.println("Initial rate: $" + ChargingStation.electricityRate + "/unit");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("\nUpdating electricity rate to $0.18/unit...");
        ChargingStation.electricityRate = 0.18;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("\nTotal Stations: " + ChargingStation.totalStations);
    }
}
