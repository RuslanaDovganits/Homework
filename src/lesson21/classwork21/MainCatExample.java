package lesson21.classwork21;

import lesson21.classwork21.petClinic.Cat;

public class MainCatExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        PersidCat catSecond = new PersidCat();

        cat.eat(1000);
        catSecond.eat(1000);
    }
}
