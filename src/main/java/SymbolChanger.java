import java.util.List;

public class SymbolChanger {
    static void change(int numberOfSymbol, char characterToInsert, String fileName) {
        List<String> list = FileReader.readFile(fileName);
        for (String s : list) {
            char[] charArray = s.toCharArray();
            for (int i = 0; i <= charArray.length - 1; i++) {
                if ((i + 1) % numberOfSymbol == 0) {
                    charArray[i] = characterToInsert;
                }
            }
            String result = new String(charArray);
            System.out.println(result);
        }
    }
}

