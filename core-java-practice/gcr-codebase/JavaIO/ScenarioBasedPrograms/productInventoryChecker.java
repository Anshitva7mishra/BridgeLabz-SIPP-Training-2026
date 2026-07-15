import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class productInventoryChecker {
    public static void main(String[] args) {
        String filename = "inventory.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split("-");
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        try {
                            int quantity = Integer.parseInt(parts[1].trim());
                            if (quantity == 0) {
                                System.out.println(name + " is out of stock");
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid format: " + line);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
