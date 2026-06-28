import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class emailDomainCounter {
    public static void main(String[] args) {
        String filename = "emails.txt";
        List<String> emails = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    emails.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        String[] domains = new String[emails.size()];
        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i);
            int index = email.indexOf('@');
            if (index != -1) {
                domains[i] = email.substring(index + 1);
            }
        }

        Map<String, Integer> counts = new HashMap<>();
        for (String domain : domains) {
            if (domain != null) {
                counts.put(domain, counts.getOrDefault(domain, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String domainName = entry.getKey();
            int dotIndex = domainName.indexOf('.');
            String displayName = dotIndex != -1 ? domainName.substring(0, dotIndex) : domainName;
            displayName = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            System.out.println(displayName + " Count = " + entry.getValue());
        }
    }
}
