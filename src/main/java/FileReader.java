import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReader {
    static List<String> readFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return Collections.EMPTY_LIST;
    }
}
