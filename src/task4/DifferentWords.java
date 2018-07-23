package task4;

//����� ���� � ������� �� ���������� �����. �������� ��� ��������� �����. ��� ������� ����� ���������� �������
// ��� �������������. �����, ������������ ��������� ����, ������� ����������. ������������ ����� HashMap.

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
            System.out.println("������ ������ �����.");
        }

        System.out.println("���� ������� ��������.");

        for (String str : linkedList) {
            hm.put(str, Collections.frequency(linkedList, str));
        }

        System.out.println("������� ������������� ���� � �����:");
        Set<Map.Entry<String, Integer>> st = hm.entrySet();
        for (Map.Entry<String, Integer> map : st) {
            System.out.println("����: \"" + map.getKey() + "\", " + "��������: \"" + map.getValue() + "\".");
        }
    }
}
