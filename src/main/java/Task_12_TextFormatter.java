import java.util.LinkedList;
import java.util.List;

public class Task_12_TextFormatter {
    public static final String FOUR_SPACES_TO_START_STRING = "    ";

    public static void format(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 12---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            if (s.length() > 120) {
                final String endPunctuationMarks = s.replaceAll("[^!.?]", "");
                String[] sentences = s.split("[.!?]");
                int counter = -1;
                if (sentences.length > 0) {
                    for (String sentence : sentences) {
                        counter++;
                        String uppedFirstSymbol = upFirstSymbol(sentence);
                        if (sentence.length() <= 120) {
                            String resultString = new StringBuilder(uppedFirstSymbol).insert(0, FOUR_SPACES_TO_START_STRING).
                                    append(endPunctuationMarks.charAt(counter)).toString();
                            resultList.add(resultString);
                        } else if (sentence.length() > 120) {
                            String[] subSentences = sentence.split("[,]");
                            for (String subSentence : subSentences) {
                                subSentence = subSentence.trim();
                                String resultString = new StringBuilder(subSentence).insert(0, FOUR_SPACES_TO_START_STRING).
                                        append(endPunctuationMarks.charAt(counter)).toString();
                                resultList.add(resultString);
                            }
                        }
                    }
                }
            }
            if (s.length() > 0 && s.length() <= 120) {
                String uppedFirstSymbol = upFirstSymbol(s);
                String resultString = new StringBuilder(uppedFirstSymbol).insert(0, FOUR_SPACES_TO_START_STRING).toString();
                resultList.add(resultString);
            }
        }
        for (String s : resultList) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }

    private static String upFirstSymbol(String sentence) {
        String result = "";
        sentence = sentence.trim();
        char[] chars = sentence.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            result = result.concat(Character.toString(chars[i]));
        }
        return result;
    }
}

