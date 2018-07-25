package task2;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class StackReverce {
    public static void main(String[] args) {
        Integer integer = Integer.parseInt(print());
        int a;

        Deque<Integer> dq = new LinkedList<>();
        while ((a = integer % 10) != 0) {
            dq.addFirst(a);
            integer = integer / 10;
        }

        System.out.println(dq);

        int b;
        while ((dq.peekLast()) != null) {
            b = dq.pollLast();
            System.out.print(b);
        }
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
