package task1;

//������ ������ �� �����, �������� � ������. ������� ������ � ���� � �������� �������.

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Reverce {
    public static void main(String[] args) {
        String s;

        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\newFolder\\text1.txt"))) {
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException exc) {
            System.out.println("������ ������ �����." + exc);
        }

        System.out.println("������ �� ����� �������.");
        System.out.println("����� ������ �� �����:\n" + list);

        Collections.reverse(list);

        System.out.println("������ � �������� �������\n" + list);

        try (FileWriter fw = new FileWriter("C:\\newFolder\\text2.txt")) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String st = it.next();
                fw.write("\r\n"+ st);
            }

        } catch (IOException exc) {
            System.out.println("������ ������ �����.");
        }
        System.out.println("������ � ���� �������.");
    }
}
