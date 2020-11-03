import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_11_DeleterEverythingBetweenParentheses {
    public static final Pattern IN_PARENTHESES = Pattern.compile("\\((.*?)\\)");

    public static void delete(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 11---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            Matcher result = IN_PARENTHESES.matcher(s);
            int control = 0;
            while (result.find()) {
                resultList.add(result.replaceAll("").toString());
                control++;
            }
            if (control == 0) resultList.add(s);
        }
        for (String s : resultList) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}
