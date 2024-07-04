package practice;

import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String: ");
        String text = scanner.nextLine();
        Map<String, Integer> wordCounts = new java.util.HashMap<>();
        String[] words = text.split(" ");


        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word,1);
            }
        }
        System.out.println("result: ");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
