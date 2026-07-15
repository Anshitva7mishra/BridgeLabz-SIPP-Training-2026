import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "report_card.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 1) {
                    String name = parts[0].trim();
                    int totalMarks = 0;
                    int subjectCount = parts.length - 1;

                    for (int i = 1; i < parts.length; i++) {
                        totalMarks += Integer.parseInt(parts[i].trim());
                    }

                    double average = (double) totalMarks / subjectCount;
                    String report = String.format("Name: %s, Average: %.2f", name, average);
                    
                    writer.write(report);
                    writer.newLine();
                }
            }
            System.out.println("Report cards generated successfully and appended to " + outputFile);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + inputFile + "' was not found. Please ensure it exists.");
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid mark format found in the input file.");
        }
    }
}
