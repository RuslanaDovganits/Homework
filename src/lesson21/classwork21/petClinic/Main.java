package lesson21.classwork21.petClinic;

import lesson21.classwork21.Person;

public class Main {
    public static void main(String[] args) {
        Swimmable a = new Dog();


        Swimmable b = new Pig();
        Person person = new Person();

        Pool pool = new Pool();
        pool.goSwimming(a);
        pool.goSwimming(b);
        pool.goSwimming(person);


    }
}
