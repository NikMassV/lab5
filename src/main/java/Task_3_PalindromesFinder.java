import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_3_PalindromesFinder {

    public static void findAllPalindromes(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 3---");
        List<String> list = FileReader.readFile(fileName);
        Set<String> palindromes = new HashSet<>();
        for (String s : list) {
            s.replaceAll("[!.?,(\\.+){3}]", " "); //todo
            String words[] = s.trim().split(" ");
            if (words.length > 0) {
                for (String word : words) {
                    if (word.length() == 1 || word.length() == 0) {
                        continue;
                    } else if (isPalindrome(word)) {
                        palindromes.add(word);
                    }
                }
            }
        }
        System.out.println(palindromes);
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }

    private static boolean isPalindrome(String word) {
        StringBuilder rightCharacterOrder = new StringBuilder(word);
        StringBuilder reverseCharacterOrder = rightCharacterOrder.reverse();
        return (reverseCharacterOrder.toString()).equals(word);
    }
}
