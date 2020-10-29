import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelAndConsonantCounter {
    static void count(String fileName) {
        Pattern vowels = Pattern.compile("(?iu)[уеыаоэяию]");
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
        System.out.println("Количество гласных в тексте: " + vowelsCounter);
        System.out.println("Количество согласных в тексте: " + consonantsCounter);
    }
}

