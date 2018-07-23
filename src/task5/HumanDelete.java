package task5;

//� ����� ����� N �������, ��������������� �� 1 �� N.
// ��� ������� ����� �� ����� ������������� ������ ������ �������, ���� �� ��������� ����.
// ��������� ��� ���������, ������������ �������.
// ���� �� �������� ������ ������������ ����� ArrayList, � ������ � LinkedList.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class HumanDelete {
    public static void main(String[] args) {
        int n = printNumberHuman();
        ArrayList<Human> arrayList = new ArrayList<>();
        LinkedList<Human> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(createHuman());
        }
        linkedList.addAll(arrayList);


        while (arrayList.size() != 1) {
            for (int i = arrayList.size(); i > 0; i--) {
                arrayList.remove(--i);
            }
        }
//
//        while (linkedList.size() != 1) {
//            for (int i = linkedList.size(); i > 0; i--) {
//                linkedList.remove(--i);
//            }
//        }
        System.out.println(arrayList);
        System.out.println();
        System.out.println(linkedList);
    }


    public static Human createHuman() {
        String[] arr = printMargins();
        while (arr.length != 3) {
            System.out.println("������ ������� �������, ������� ���������� ������!");
            arr = printMargins();
        }
        try {
            int id = Integer.parseInt(arr[0]);
            int age = Integer.parseInt(arr[2]);
        } catch (NumberFormatException exc) {
            System.out.println("������� ���������� ������!");
            arr = printMargins();
        }
        return new Human(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
    }

    public static int printNumberHuman() {
        int number = 0;
        System.out.println("������� ���������� �������:");
        BufferedReader bf=null;
        InputStreamReader inputStreamReader=null;
        try {
            inputStreamReader = new InputStreamReader(System.in);
            bf = new BufferedReader(inputStreamReader);
            number = Integer.parseInt(bf.readLine());
        } catch (IOException exc) {
            System.out.println("������ ����� � ����������.");
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return number;
    }

    public static String[] printMargins() {
        String string = null;
        String[] arr = null;
        System.out.println("������� ������ �� �������� � �������: \"id, ���, �������\": ");
        BufferedReader reader=null;
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(System.in);
            reader = new BufferedReader(inputStreamReader);
            string = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (string != null) {
            string = string.trim();
            arr = string.split("(\\W+$)|(\\s+\\W+\\s+)|(\\W+)|(\\W+\\s+)");
        }
        return arr;
    }
}
