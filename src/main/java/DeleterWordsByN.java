import java.util.List;
import java.util.regex.Pattern;

public class DeleterWordsByN {
    public static final Pattern PUNCTUATION_MARKS = Pattern.compile("(?u)[~`!@\".,\\-:;'^&%]");
    static void delete(int numberOfCharacters, String fileName) {
        List<String> list = FileReader.readFile(fileName);
        for (String s : list) {
            String outgoingString = "";
            int counter = 0;
            String[] words = s.split(" ");
            for (int k = 0; k <= words.length - 1; k++) {
                for (int i = 0; i <= words.length - 1; i++) {
                    if (words[i].length() == numberOfCharacters) {
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
                outgoingString = String.join(" ", outgoingString, words[l]);
            }
            System.out.println(outgoingString);
            System.out.println();
        }
    }
}
