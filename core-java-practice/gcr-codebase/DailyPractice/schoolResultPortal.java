import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class schoolResultPortal {
    public static void main(String[] args) {
        processResults("students.txt", "reportCards.txt");
    }

    public static void processResults(String inputFileName, String outputFileName) {
        try {
            File inputFile = new File(inputFileName);
            Scanner scanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFileName, true);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String name = parts[0];
                    double sum = 0;
                    for (int i = 1; i < parts.length; i++) {
                        sum += Double.parseDouble(parts[i].trim());
                    }
                    double average = sum / (parts.length - 1);
                    writer.write(name + " - Average: " + String.format("%.2f", average) + "\n");
                }
            }
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The input file could not be found.");
        } catch (IOException e) {
            System.out.println("Error: Could not write to the output file.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in input file.");
        }
    }
}
