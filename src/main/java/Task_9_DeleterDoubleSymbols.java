import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Task_9_DeleterDoubleSymbols {
    public static void delete(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 9---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            String resultString = s.replaceAll("([\\w\\W])\\1+", "$1");
            resultList.add(resultString);
        }
        for (String s : resultList) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}
