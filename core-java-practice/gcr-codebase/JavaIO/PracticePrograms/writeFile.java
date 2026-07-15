import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("output.txt");
        // fw.write("Hello, Java I/O!\n");
        // fw.write("Another line.\n");
        // fw.close();
        FileWriter fw = new FileWriter("log.txt", true); 
        fw.write("New entry\n");
        fw.close();

    }
}
