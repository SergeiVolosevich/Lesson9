package task2;

//������ �����, ������� ��� ����� � ����. ������� �����, � �������� ����� ���� � �������� �������.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class StackReverce1 {
    public static void main(String[] args) {
        char[] ch = print().toCharArray();

        Deque<Character> dq = new LinkedList<>();
        for (int i = 0; i < ch.length; i++) {
            dq.add(ch[i]);
        }

        System.out.println("���� " + dq);

        char b;
        String bb = "";
        while ((dq.peekLast()) != null) {
            b = dq.pollLast();
            bb = bb + b;
        }
        System.out.println("����� � �������� �������, � ������� �����: " + bb);
    }

    public static String print() {
        System.out.println("������� �����:");

        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException exc) {
            System.out.println("������ ����� �����." + exc);
        }
        return s;
    }
}

