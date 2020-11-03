import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.List;

public class Task_1_ExtraSpacesRemover {

    public static void remove(String fileName) {
        long startTime = System.currentTimeMillis();
        System.out.println("---Task 1---");
        List<String> list = FileReader.readFile(fileName);
        List<String> resultList = new LinkedList<>();
        for (String s : list) {
            String[] words = s.split(" ");
            if (words.length > 0) {
                String resultString = "";
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals("")) continue;
                    else if (words[i].equals(".") || words[i].equals(",") || words[i].equals("!") || words[i].equals("?")) {
                        words[i].trim();
                        resultString = String.join("", resultString, words[i]);
                    } else {
                        words[i].trim();
                        resultString = String.join(" ", resultString, words[i]);
                    }
                }
                resultList.add(resultString);
            }
        }
        for (String result : resultList) {
            System.out.println(result);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took time: " + (endTime - startTime) / 1000d + " sec.");
    }
}



