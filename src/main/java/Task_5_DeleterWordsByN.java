import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_DeleterWordsByN {

    static void delete(int numberOfCharacters, String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 5---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            String resultString = "";
            int counter = 0;
            String[] words = s.split(" ");
            if (words.length > 0) {
                for (int k = 0; k <= words.length - 1; k++) {
                    for (int i = 0; i <= words.length - 1; i++) {
                        if (words[i].length() == numberOfCharacters || (words[i].length() == numberOfCharacters + 1 && isWordWithoutMark(words[i]) == true)) {
                            counter++;
                            for (int j = i; j <= words.length - 1; j++) {
                                if (j == words.length - 1) break;
                                else {
                                    words[j] = words[j + 1];
                                }
                            }
                        }
                    }
                }
                for (int l = 0; l < words.length - counter; l++) {
                    resultString = String.join(" ", resultString, words[l]);
                }
                resultList.add(resultString);
            }
        }
        for (String result : resultList) {
            System.out.println(result);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }

    private static boolean isWordWithoutMark(String word) {
        Pattern punctuationMarks = Pattern.compile("[`!?.,(...)\'\"\\-]");
        Matcher matcher = punctuationMarks.matcher(word);
        while (matcher.find()) {
            return true;
        }
        return false;
    }
}
