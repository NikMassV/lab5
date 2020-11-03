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

//    long startTime = System.currentTimeMillis();
//        System.out.println("---Task 9---");
//                List<String> list = FileReader.readFile(fileName);
//        List<String> resultList = new LinkedList<>();
//        for (String s : list) {
//        char[] string = s.toCharArray();
//        if (string.length > 0) {
//        int counter = 0;
//        for (int i = 1; i < string.length - counter; i++) {
//        if (i == (string.length - 1) && string[string.length - 1] == string[string.length - 2]) {
//        counter++;
//        break;
//        } else if (string[i] == string[i - 1]) {
//        for (int j = i; j <= string.length - 1 - counter; j++) {
//        if (j == string.length - 1 - counter) {
//        counter++;
//        break;
//        } else {
//        string[j - 1] = string[j];
//        }
//        }
//        }
//        }
//        String resultString = String.copyValueOf(string, 0, string.length - 1 - counter);
//        resultList.add(resultString);
//        }
//        }
//        for (String s : resultList) {
//        System.out.println(s);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");