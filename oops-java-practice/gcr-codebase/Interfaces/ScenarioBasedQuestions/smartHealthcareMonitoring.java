interface HeartRateMonitor {
    default void displayHealthTips() {
        System.out.println("Heart Rate Tips: Keep resting heart rate between 60-100 bpm.");
    }
}

interface TemperatureMonitor {
    default void displayHealthTips() {
        System.out.println("Temperature Tips: Normal body temperature is around 37°C (98.6°F).");
    }
    static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.startsWith("PAT-");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void processPatients(String[] names, String[] ids, int[] heartRates, double[] temperatures) {
        System.out.println("\nGenerating Health Report:");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String id = ids[i];
            boolean isValidId = TemperatureMonitor.isPatientIdValid(id);

            if (!isValidId) {
                System.out.println("Patient " + name + " ignored due to invalid Patient ID: " + id);
                continue;
            }

            int hr = heartRates[i];
            double temp = temperatures[i];
            String status = (hr >= 60 && hr <= 100 && temp >= 36.0 && temp <= 37.5) ? "Healthy" : "Needs Attention";
            System.out.printf("Patient: %s (%s) | Heart Rate: %d bpm | Temp: %.1f°C | Status: %s%n", name, id, hr, temp, status);
        }
    }
}

public class smartHealthcareMonitoring {
    public static void main(String[] args) {
        String[] patientNames = {"Alice", "Bob", "Charlie"};
        String[] patientIds = {"PAT-101", "INVALID-102", "PAT-103"};
        int[] heartRates = {72, 85, 110};
        double[] temperatures = {36.8, 38.5, 36.5};

        HealthMonitoringSystem system = new HealthMonitoringSystem();
        system.displayHealthTips();

        system.processPatients(patientNames, patientIds, heartRates, temperatures);
    }
}
