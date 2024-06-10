package lesson24.homework24;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //1.
        //1. Пользователь вводит строку через консоль, разделить строку на слова, а также:
        //1. Из каждого слова возьмите первую букву и составьте из них строку, в которой содержались бы все первые буквы слов
        //2. Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова
        //


            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            String[] words = text.split(" ");

            String result = "";

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                result += word.substring(0, 1);
            }

            System.out.println(result);
            System.out.println(result.length());
            System.out.println(result.charAt(0));
            System.out.println(result.charAt(result.length() - 1));

        }

    }

