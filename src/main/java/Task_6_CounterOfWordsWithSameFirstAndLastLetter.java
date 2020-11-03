import java.util.List;

public class Task_6_CounterOfWordsWithSameFirstAndLastLetter {
    public static void count(char character, String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 6---");
        List<String> list = FileReader.readFile(fileName);
        int counter = 0;
        for (String s : list) {
            String stringWithoutMarks = s.replaceAll("[!.,?(...)\'\"]", "");
            String[] words = stringWithoutMarks.split(" ");
            if (words.length > 0) {
                for (String word : words) {
                    if (word.length() > 0) {
                        char firstSymbol = word.charAt(0);
                        char lastSymbol = word.charAt(word.length() - 1);
                        if (character == firstSymbol) {
                            if (character == lastSymbol) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Such words: " + counter);
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}
