class WaterBottle {
    private String ownerName;
    private double dailyTarget;

    public WaterBottle(String ownerName, double dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    public void displayBottleInfo() {
        System.out.println("Owner: " + ownerName + " | Daily Water Target: " + dailyTarget + " ml");
    }
}

public class smartWaterBottleTracker {
    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle("Alice", 2500.0);
        WaterBottle b2 = new WaterBottle("Bob", 3000.0);

        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}
