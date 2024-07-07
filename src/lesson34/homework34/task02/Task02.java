package lesson34.homework34.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
1. Создайте класс Person
1.2 Добавьте в этот класс 3 поля: имя, папа и мама. Папа и мама - тоже поля класса Person
2.1. У вас есть список из людей, найдите среди них всех их мам и пап, у которых имя длиннее 6 букв

Подскажка: Делайте либо через Stream.of(), либо делаем по отдельности (способ Владимира)

Дополнение: важно поработать со стримами, но разрешается где-то какое-то действие выполнить без них
 */
public class Task02 {
    public static void main(String[] args) {

        Person person1 = new Person("Игор", "Лариса", "Вечяслав");
        Person person2 = new Person("Антон", "Динара", "Александр");
        Person person3 = new Person("Света", "Руслана", "Олег");
        Person person4 = new Person("Олеся", "Екатерина", "Леонидик");

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        List <String> names = persons.stream()
                .flatMap(c -> Stream.of(c.getMother(), c.getFather()))
                .filter(c -> c.length() > 6)
                .toList();

        System.out.println("Имена длинее 6 символов: " + names);


    }
}
