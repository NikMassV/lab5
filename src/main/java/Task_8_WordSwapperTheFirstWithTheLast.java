import java.util.LinkedList;
import java.util.List;

public class Task_8_WordSwapperTheFirstWithTheLast {


    static void swap(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 8---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            StringBuilder resultString = new StringBuilder();
            final String punctuationMarks = s.replaceAll("[^!.?]", "");
            String[] sentences = s.split("[.!?]");
            for (int i = 0; i < sentences.length; i++) {
                String sentence = sentences[i].trim();
                String[] words = sentence.split(" ");
                if (words.length > 0) {
                    String temp = words[0];
                    words[0] = words[words.length - 1];
                    words[words.length - 1] = temp;
                }
                sentence = String.join(" ", words);
                resultString.append(sentence).append(punctuationMarks.charAt(i)).append(" ");
            }
            resultList.add(resultString.toString().trim());
        }
        for (String s: resultList){
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}


