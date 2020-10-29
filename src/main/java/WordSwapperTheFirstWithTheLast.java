import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSwapperTheFirstWithTheLast {
    public static final String PUNCTUATION_MARKS = "(?U)^(\\\\w+)(.*)(\\\\b\\\\w+)([.?!]?$)";

    static void swap(String fileName) {
        List<String> list = FileReader.readFile(fileName);
//        String[] outgoingList = new String[list.toString().length];
        for (String s : list) {
//            outgoingList = s.trim().replaceAll(PUNCTUATION_MARKS, "$3");
            }
        }
    }


//            String outgoingString = "";
//            String[] words = s.split(" ");
//            String tmp = words[0];
//            words[0] = words[words.length - 1];
//            words[words.length - 1] = tmp;
//            for (String word : words) {
//                outgoingString = String.join(" ", outgoingString, word);
//            }
//            System.out.println(outgoingString);
//            System.out.println();