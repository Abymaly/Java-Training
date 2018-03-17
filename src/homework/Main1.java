package homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {

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
        String allLineStrTxt = allLineStr.replaceAll("\\.", " ");
        //String allLineStrTxt = allLineStr.replaceAll(".", "_"); // a to nie bangla
        System.out.println(allLineStrTxt);

        //String[] allLineWord = allLineStrTxt.split(" ");

    }
}