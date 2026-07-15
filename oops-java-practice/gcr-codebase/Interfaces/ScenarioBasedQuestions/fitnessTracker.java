interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Trackable data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String deviceName;

    public FitnessDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void logActivity() {
        System.out.println(deviceName + ": Logging daily activity steps.");
    }

    @Override
    public void generateReport() {
        System.out.println(deviceName + ": Generating weekly fitness report.");
    }

    @Override
    public void sendAlert() {
        System.out.println(deviceName + ": Alert! Idle for too long. Time to move!");
    }
}

public class fitnessTracker {
    public static void main(String[] args) {
        FitnessDevice tracker = new FitnessDevice("FitBit Pro");
        tracker.logActivity();
        tracker.generateReport();
        tracker.sendAlert();
        tracker.resetData();
    }
}
