package lesson30.homework30;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Map<String, Integer> strings = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");

        while (true) {
            String str = scanner.nextLine();

            if (strings.containsKey(str)) {
                int count = strings.get(str);
                strings.put(str, count + 1);
                System.out.println("Строка искалась " + count + " раз.");

            } else {
                strings.put(str, 1);
                System.out.println("Строка искалась 1 раз.");
            }


        }

    }
}




