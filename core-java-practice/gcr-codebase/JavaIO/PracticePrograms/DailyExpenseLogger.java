import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        String outputFile = "expenses.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {

            System.out.println("Enter expense details (e.g., Food - 200).");
            System.out.println("Type 'exit' to stop adding expenses.");

            while (true) {
                System.out.print("Enter expense: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input);
                writer.newLine();
                
                writer.flush();
                System.out.println("Expense added.");
            }

            System.out.println("All expenses have been saved/appended to " + outputFile);

        } catch (IOException e) {
            System.err.println("An error occurred while saving the expense: " + e.getMessage());
        }
    }
}
