import java.util.LinkedList;
import java.util.List;

public class Task_4_ReverseOrderWords {

    public static void print(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 4---");
        List<String> list = FileReader.readFile(fileName);
        for (String s : list) {
            String[] words = s.split(" ");
            if (words.length > 0) {
                for (int i = words.length - 1; i >= 0; i--) {
                    System.out.print(words[i] + " ");
                }
                System.out.println();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}
