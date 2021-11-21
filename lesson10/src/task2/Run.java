package task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        String path = new String("src\\task2\\resources\\word.txt");
        String[] lines = IOUtils.getLines(path);
        String result = new String("src\\task2\\resources\\result.txt");
        Map<String, Integer> listOfUniqWords = new LinkedHashMap<>();
        for (String line: lines){
            String[] words = IOUtils.splitOnWords(line);
            for (String word: words){
                Integer counter = listOfUniqWords.get(word.toLowerCase());
                if (counter == null){
                    counter = 0;
                }
                listOfUniqWords.put(word.toLowerCase(), ++counter);
            }
        }
        System.out.println(listOfUniqWords.toString());
    }
}
