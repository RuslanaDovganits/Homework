package lesson33.homework33;

import java.util.ArrayList;
import java.util.List;

/*
Решите задания с использованием Стримов (Stream) и лямбда-выражений

1.1. Существует список из чисел (заполнить его можно как угодно)
1.2. Добавьте к каждому из чисел из списка 15
1.3. Оставьте только числа, большие чем 50
1.4. Найдите сумму чисел
 */
public class Task01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(34);
        numbers.add(67);
        numbers.add(22);
        numbers.add(37);
        numbers.add(78);

        int number = numbers.stream()
                .map(n -> n + 15)
                .filter(n -> n >50)
                .reduce((x,y) -> (x + y))
                .orElse(0);
        System.out.println(number);




    }
}

