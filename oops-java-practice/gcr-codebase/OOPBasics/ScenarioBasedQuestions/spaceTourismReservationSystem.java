class SpaceTourist {
    public static int totalReservations = 0;
    public static String missionName = "Apollo 2026";
    private String touristName;
    private int seatNumber;

    public SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    public SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public void displayDetails() {
        System.out.println("Tourist: " + touristName + " | Seat: " + seatNumber + " | Mission: " + missionName + " | Total Reservations: " + totalReservations);
    }
}

public class spaceTourismReservationSystem {
    public static void main(String[] args) {
        SpaceTourist tourist = new SpaceTourist("Alice", 5);
        tourist.displayDetails();

        tourist.updateSeatNumber(10).updateSeatNumber(15);
        tourist.displayDetails();
    }
}
