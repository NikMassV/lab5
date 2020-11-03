import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2_VowelAndConsonantCounter {

    public static void count(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 2---");
        Pattern vowels = Pattern.compile("(?iu)[уеыаоэяиюё]");
        Pattern consonants = Pattern.compile("(?iu)[йцкнгшщзхъфвпрлджчсмтьб]");
        List<String> list = FileReader.readFile(fileName);
        int vowelsCounter = 0, consonantsCounter = 0;
        for (String s : list) {
            Matcher matcherVowels = vowels.matcher(s);
            Matcher matcherConsonants = consonants.matcher(s);
            while (matcherVowels.find()) {
                vowelsCounter++;
            }
            while (matcherConsonants.find()) {
                consonantsCounter++;
            }
        }
        System.out.println("Number of vowels in the text: " + vowelsCounter);
        System.out.println("Number of consonants in the text: " + consonantsCounter);
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}

