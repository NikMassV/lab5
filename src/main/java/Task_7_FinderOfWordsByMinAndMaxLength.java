import java.util.List;

public class Task_7_FinderOfWordsByMinAndMaxLength {
    public static void find(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 7---");
        List<String> list = FileReader.readFile(fileName);
        StringBuilder minWords = new StringBuilder();
        StringBuilder maxWords = new StringBuilder();
        for (String s : list) {
            String stringWithoutMarks = s.replaceAll("[!.?,]", "");
            String[] words = stringWithoutMarks.split(" ");
            int minLength = words[0].length();
            int maxLength = words[0].length();
            if (words.length > 0) {
                for (String word : words) {
                    if (minLength > word.length() && word.length() != 0) {
                        minLength = word.length();
                        minWords.delete(0, minWords.length() - 1);
                    }
                    if (maxLength < word.length()) {
                        maxLength = word.length();
                        maxWords.delete(0, maxWords.length() - 1);
                    }
                    if (minLength == word.length() && word.length() != 0) {
                        minWords.append(word).append(" ");
                    }
                    if (maxLength == word.length()) {
                        maxWords.append(word).append(" ");
                    }
                }
            }
        }
        System.out.println("min: " + minWords);
        System.out.println("max: " + maxWords);
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}
