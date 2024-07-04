package lesson27.homework27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
2) После КАЖДОГО введеного числа сообщите пользователю информацию:
2.1) Среднее значение температуры ядерного за ВСЕ время
2.2) Насколько текущая введеная температура отличается от предыдущей
2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
 То напишите на экран собщение "Тревога, превышение температуры"

Усложненное задание:
3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения
 */
public class Task01 {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите температуру реактора:");
            double temperature = scanner.nextDouble();
            temperatures.add(temperature);
            double averageTemperature = 0;
            double totalTemperature = 0;

            for (int i = 0; i < temperatures.size(); i++) {
                totalTemperature = totalTemperature + temperatures.get(i);

                averageTemperature = totalTemperature / temperatures.size();

            }

            System.out.println("Средняя температура: " + averageTemperature);
            if (temperatures.size() < 2) {
                System.out.println("Тыкай дальше =) ");
            } else {
                double lastTemperature = temperatures.get(temperatures.size() - 1);
                double previousTemperature = temperatures.get(temperatures.size() - 2);
                double tempDifference = lastTemperature - previousTemperature;
                System.out.println("Текущая введенная температура отличается от предыдущей на " + tempDifference + " градусов");

                if (temperature > averageTemperature * 1.10 && temperature > previousTemperature * 1.20){
                    System.out.println("Тревога, превышение температуры\nСрочно покиньте помещение!!! ");
                    break;
                }

            }
        }
    }
}





