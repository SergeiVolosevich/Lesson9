package task4;

//Задан файл с текстом на английском языке. Выделить все различные слова. Для каждого слова подсчитать частоту
// его встречаемости. Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DifferentWords {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        String[] arr;

        HashMap<String, Integer> hm = new HashMap<>();

        String stringfinal;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\newFolder\\englishtext.txt"))) {
            String string;

            while ((string = bf.readLine()) != null) {
                stringfinal =  string.trim();
                arr = stringfinal.split("(\\s)|(\\W\\s)|(\\W$)");
                linkedList.addAll(Arrays.asList(arr));
            }

        } catch (IOException exc) {
            System.out.println("Ошибка чтения файла.");
        }

        System.out.println("Файл успешно прочитан.");

        for (String str : linkedList) {
            hm.put(str, Collections.frequency(linkedList, str));
        }

        System.out.println("Частота встречаемости слов в файле:");
        Set<Map.Entry<String, Integer>> st = hm.entrySet();
        for (Map.Entry<String, Integer> map : st) {
            System.out.println("Ключ: \"" + map.getKey() + "\", " + "Занчение: \"" + map.getValue() + "\".");
        }
    }
}
