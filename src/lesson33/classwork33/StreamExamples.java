package lesson33.classwork33;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class StreamExamples {



        //Промежуточные
        //1. sorted() - сортирует, при условии, что у вас реализован интерфейс Comparable (22 раза)
        //2. limit(n) - оставляет только n элементов
        //3. filter() - фильтрует элементы по какому-то правилу (222 раза)
        //4. map() - преобразует один элемент в другой элемент (тип данных тоже может поменяться) (392 раза)

        //5. distinct() - оставляет только уникальные элементы в стриме
        //6. skip() - пропустить некоторое колв-о элементов (2 раза)


        //Терминальные
        //1. toList() - создать из стрима лист (333раза)
        //2. reduce() - сокращает ваш стрим до одного-единственого элемента по какому-то правилу (16 раз)
        //3. allMatch() - возвращает true, только если все элементы в в стриме соотносятся с условием
        //4. anyMatch() - возвращает true, если хотя бы 1 элемент в в стриме соотносится с условием (27 раз)
        //5. forEach() - сделать какой-то код для каждого элемента стрима (210 раза)

        //6. findAny() - возвращает вам любой (**случайный**) элемент из стрима
        //7. findFirst() - возвращает вам первый элемент из стрима
        //8. max() - найти наибольший элемент в стриме
        //9. min() - найти наименьший элемент в стриме
        //10. count() - количество элементов на текущий момент


        public static void main(String[] args) {
            //Есть список из чисел, добавьте к каждому из них 4
            //Отсортировать эти числа и вывести на экран 5 самых большие чисел, которые делятся на 5

            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                list.add(random.nextInt(0, 10_000));
            }

            System.out.println(list);

            List<Integer> newList = list.stream()
                    .map((x) -> x + 4)
                    .sorted(Comparator.reverseOrder())
                    .filter(x -> x % 5 == 0)
                    .limit(5)
                    .toList();

            long count = list.stream()
                    .filter((x) -> x > 5000)
                    .count();

            boolean all = list.stream().allMatch(x -> x > 9000);
            boolean any = list.stream().anyMatch(x -> x > 9000);


            System.out.println(all);
            System.out.println(any);
            System.out.println(count);
            System.out.println(newList);

            Optional<Integer> anyOptional = list.stream().findAny();
            Optional<Integer> firstOptional = list.stream().findFirst();

            System.out.println(anyOptional.get());
            System.out.println(firstOptional.get());

            list.stream().forEach(x -> {
                int a = random.nextInt();
                System.out.println(a);
            });

            Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
            Optional<Integer> min = list.stream().min(Comparator.naturalOrder());

            System.out.println(max.get());
            System.out.println(min.get());


            Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
            System.out.println(sum.get());

            long distinctCount = list.stream().distinct().count();
            System.out.println(distinctCount);

            long skipCount = list.stream().skip(30).count();
            System.out.println(skipCount);

            List<Integer> moreThanZero = list.stream()
                    .filter(x -> x > 0)
                    .toList();

            moreThanZero = list.stream()
                    .filter(x -> moreThanZero(x))
                    .toList();

            List<Integer> randomList = random.ints(100)
                    .boxed()
                    .toList();

            System.out.println(randomList);
        }

        public static boolean moreThanZero(int x) {
            return x > 0;
        }
    }

