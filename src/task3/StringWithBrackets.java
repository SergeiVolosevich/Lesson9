package task3;

// Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
// Проверить правильность расстановки скобок. Использовать стек.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class StringWithBrackets {
    public static void main(String[] args) {
        int ch = 0;
        Deque<Character> dq = new LinkedList<>();

        try (FileInputStream fl = new FileInputStream("C:\\newFolder\\stringtext.txt")) {
            while ((ch = fl.read()) != -1) {
                dq.add((char) ch);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка чтения файла");
        }

        System.out.println(dq);

        Character chr;
        int i = 0;
        int j = 0;
        int h = 0;
        int m = 0;
        int l = 0;
        int k = 0;
        while ((chr = dq.pollLast()) != null) {
            switch (chr) {
                case ('{'):
                    i++;
                    break;
                case ('('):
                    j++;
                    break;
                case ('['):
                    h++;
                    break;
                case ('}'):
                    m++;
                    break;
                case (')'):
                    l++;
                    break;
                case (']'):
                    k++;
                    break;
            }
        }

        if (i == m && j == l && h == k) {
            System.out.println("Скобки расставлены правильно.");
        } else {
            System.out.println("Скобки расставлены неправильно.");
        }
    }
}

