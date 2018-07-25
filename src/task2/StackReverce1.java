package task2;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

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

        System.out.println("Стек " + dq);

        char b;
        String bb = "";
        while ((dq.peekLast()) != null) {
            b = dq.pollLast();
            bb = bb + b;
        }
        System.out.println("Число в обратном порядке, с помощью стека: " + bb);
    }

    public static String print() {
        System.out.println("Введите число:");

        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException exc) {
            System.out.println("Ошибка ввода числа." + exc);
        }
        return s;
    }
}

