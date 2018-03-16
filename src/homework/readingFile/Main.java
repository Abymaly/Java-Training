package homework.readingFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Ada\\Desktop\\Java Training\\homework\\txt.txt");
        String txtLine = null;
        StringBuilder allLine = new StringBuilder();

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        ) {
            while ((txtLine = bufferedFileReader.readLine()) != null) {
                allLine.append(txtLine)
                        .append(" ");
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        String allLineStr = allLine.toString();
        String allLineStrTxt = allLineStr.replaceAll(",", " ");
        // TODO: usunąć . Ale przy użyciu metody remove() nie wczytuje wtedy w ogóle tekstu
        String[] allLineWord = allLineStrTxt.split(" ");

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String oneWord : allLineWord) {

            int actCount = 0;
            if (oneWord.length() > 3) {
                if (wordsCount.containsKey(oneWord) == false){
                    wordsCount.put(oneWord, 1);
                } else {
                    actCount = wordsCount.get(oneWord) + 1;
                    wordsCount.put(oneWord, actCount);
                }
            }
        }

        class Occurency {
            String name;
            Integer occ;

            public Occurency() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getOcc() {
                return occ;
            }

            public void setOcc(Integer occ) {
                this.occ = occ;
            }
        }

        Occurency winner = new Occurency();

        Set<Map.Entry<String, Integer>> entrySet = wordsCount.entrySet();

        Integer maxCount = 0;

        for (Map.Entry<String, Integer> maxOcc : entrySet) {
            if (maxOcc.getValue() > maxCount) {
                maxCount = maxOcc.getValue();
                winner.setName(maxOcc.getKey());
                winner.setOcc(maxOcc.getValue());
            }
        }

        System.out.println(winner.getName() + " : " + winner.getOcc());

    }
}