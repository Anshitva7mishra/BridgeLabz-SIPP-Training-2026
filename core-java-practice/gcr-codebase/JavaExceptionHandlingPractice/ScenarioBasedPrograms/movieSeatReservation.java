import java.util.Scanner;

public class movieSeatReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seat position to request: ");
        int position = input.nextInt();
        
        int seatNumber = getSeat(position);
        System.out.println("Returned seat: " + seatNumber);
        
        input.close();
    }

    public static int getSeat(int index) {
        int[] seats = {101, 102, 103, 104, 105};
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid access: Seat position out of bounds.");
            return -1;
        }
    }
}
