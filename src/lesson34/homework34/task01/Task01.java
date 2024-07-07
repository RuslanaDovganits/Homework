package lesson34.homework34.task01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
2.1. Среди машин, которые имеют год выпуска новее, чем 1999, необходимо подсчитать общий пробег
2.2. Среди машин, у которых пробег более 500 000, найти самую старую машину
2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом, но не более 200 000 тысяч
 */
public class Task01 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 1980, 530_000);
        Car car1 = new Car("BMW", 2000, 200_000);
        Car car2 = new Car("Ford", 1999, 280_000);
        Car car3 = new Car("Honda", 1940, 520_000);
        Car car4 = new Car("Mercedes", 2024, 120_000);
        Car car5 = new Car("Ford", 2005, 120_000);
        Car car6 = new Car("Volvo", 2001, 180_000);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);


        Optional<Integer> optional = cars.stream()
                .filter(c -> c.getYear() > 1990)
                .map(Car::getMileage)
                .reduce((x, y) -> x + y);
        int summa = optional.get();
        System.out.println("2.1 " + summa);


        Optional<Car> optional1 = cars.stream()
                .filter(c -> c.getMileage() > 500_000)
                .min(Comparator.comparing(c -> c.getYear()));

        String name = String.valueOf(optional1.get().getName());
        System.out.println("2.2 " + name);

    //2.3. Среди машин, у которых марка начинается на "V" или "W", найти с самым большим пробегом,
    // но не более 200 000 тысяч
        Optional<Car> optional2 = cars.stream()

                .filter(c -> c.getName().startsWith("V"))
                //.filter(c -> c.getName().startsWith("W"))
                .filter(c -> c.getMileage() < 200_000)
                .max(Comparator.comparing(Car::getMileage));
        System.out.println(optional2);






    }
}
