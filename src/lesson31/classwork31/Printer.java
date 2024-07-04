package lesson31.classwork31;

public class Printer <T extends Number> {

    public void print(T value) {
        System.out.println(value.doubleValue());
    }


}
