package homework.readingFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Ada\\Desktop\\Java Training\\homework\\txt.txt");

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        ) {

            String txtLine = null;
            StringBuilder allLine = new StringBuilder();

            while ((txtLine = bufferedFileReader.readLine()) != null) {
                allLine.append(txtLine)
                .append(" ");
                // TODO: usunąć . Ale przy użyciu metody remove() nie wczytuje wtedy w ogóle tekstu
            }

            String allLineStr = allLine.toString();
            String allLineStrTxt = allLineStr.replaceAll(",", " ");
            String [] allLineWord = allLineStrTxt.split(" ");

            Map<String, Integer> wordsCount = new HashMap<>();
            int actCount = 0;

            for (String oneWord : allLineWord) {
                if (wordsCount.get(oneWord) == null) {
                    actCount = 0;
                }
                wordsCount.put(oneWord, ++actCount);
            }

            Set<Map.Entry<String, Integer>> entrySet = wordsCount.entrySet();

            String maxWord = "";
            Integer maxCount = 0;

            for (Map.Entry<String, Integer> maxOcc : entrySet) {
                if (maxOcc.getValue() > maxCount) {
                    maxCount = maxOcc.getValue();
                    maxWord = maxOcc.getKey();
                }
            }
            System.out.println(maxWord + ": " + maxCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
