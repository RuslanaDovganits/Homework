package lesson33.homework33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
2.1 Существует список строк (заполнить его можно как угодно)
2.2 Среди всех строк, оставьте только те строки, которые состоят из 15 символов или меньшего количества
2.3 Найдите самую длинную строку
 */
public class Task02 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Hello, my name is Ruslana Dovganits");
        str.add("I am 35 years old");
        str.add("Hello, my name is Ruslana. I was born in Estonia, but I live in Finland");
        str.add("My cat Njusha");
        str.add("Hello");

         String max = str.stream()
                .filter(s -> s.length() <= 15)
                .filter(s -> s.length() != 0)
                .max(Comparator.comparing(String::length))
                        .orElse(null);


        System.out.println(max);

    }
}
