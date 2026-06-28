import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
        this.seatNumber = "Not Assigned";
    }

    public void bookTicket(String seat, double additionalCost) {
        this.seatNumber = seat;
        this.price += additionalCost;
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class movieTicketBookingSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Movie Name: ");
            String movie = sc.nextLine();
            System.out.print("Enter Base Price: ");
            double basePrice = sc.nextDouble();
            sc.nextLine();

            MovieTicket ticket = new MovieTicket(movie, basePrice);

            System.out.print("Enter Seat to book: ");
            String seat = sc.nextLine();
            System.out.print("Enter any additional price (e.g. seat upgrade fee): ");
            double addCost = sc.nextDouble();

            ticket.bookTicket(seat, addCost);
            System.out.println("\nTicket Details:");
            ticket.displayDetails();
        }
    }
}
