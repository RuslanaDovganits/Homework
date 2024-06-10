package lesson25.homework25;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
1.Пользователь вводит в консоль 10 чисел.
2.Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым. Выведите его индекс на экран

Усложнения для первого задания:
1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
2. Бинарный поиск обязательно должен быть реккурсивным
 */
public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[11];
        System.out.println("Введите 10 целых чисел: ");
        for (int i = 0; i <= 10; i++) {
            numbers[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

    }


}
