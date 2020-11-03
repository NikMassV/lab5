import java.util.List;

public class Task_10_SymbolChanger {
    static void change(int numberOfSymbol, char characterToInsert, String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 10---");
        List<String> list = FileReader.readFile(fileName);
        for (String s : list) {
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if ((i + 1) % numberOfSymbol == 0) {
                    charArray[i] = characterToInsert;
                }
            }
            String result = new String(charArray);
            System.out.println(result);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}

