import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_13_NumberOfRepetitions {
    public static void count(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 13---");
        List<String> list = FileReader.readFile(fileName);
        Map<String, Integer> result = new HashMap<>();
        for (String s : list) {
            String stringWithoutMarks = s.replaceAll("[!.,?(...)\'\"]", "");
            String[] words = stringWithoutMarks.split(" ");
            if (words.length > 0) {
                for (int i = 0; i < words.length; i++) {
                    Integer counter;
                    if (words[i].length() > 0) {
                        if (result.containsKey(words[i])) {
                            counter = result.get(words[i]);
                            counter++;
                            result.put(words[i], counter);
                        } else {
                            result.put(words[i], 1);
                        }
                    }
                }
            }
        }
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}