interface LuggageScanner {
    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guidelines: Maximum weight is 23kg. Dangerous items prohibited.");
    }
}

interface PassportVerifier {
    default void displaySecurityGuidelines() {
        System.out.println("Passport Guidelines: Passport must be valid for at least 6 months.");
    }
    static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.matches("^[A-Z][0-9]{7}$");
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public boolean verifyPassenger(String name, String passportNo, double luggageWeight) {
        boolean passportValid = PassportVerifier.isPassportNumberValid(passportNo);
        boolean luggageValid = luggageWeight <= 23.0;
        System.out.println("Passenger: " + name + " | Passport valid: " + passportValid + " | Luggage weight: " + luggageWeight + "kg (Valid: " + luggageValid + ")");
        return passportValid && luggageValid;
    }
}

public class airportSecurityManagement {
    public static void main(String[] args) {
        String[] passengerNames = {"Alice", "Bob", "Charlie"};
        String[] passportNumbers = {"A1234567", "invalid123", "B7654321"};
        double[] luggageWeights = {20.5, 15.0, 25.0};

        AirportSecuritySystem system = new AirportSecuritySystem();
        system.displaySecurityGuidelines();
        System.out.println("\nProcessing Passenger Security Checks:");

        for (int i = 0; i < passengerNames.length; i++) {
            boolean canBoard = system.verifyPassenger(passengerNames[i], passportNumbers[i], luggageWeights[i]);
            System.out.println("Boarding Status for " + passengerNames[i] + ": " + (canBoard ? "APPROVED" : "DENIED"));
            System.out.println();
        }
    }
}
