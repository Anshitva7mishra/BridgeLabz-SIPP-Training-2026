import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class groceryBillReader {
    public static void main(String[] args) {
        String filename = "bill.txt";
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("\nTotal number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
