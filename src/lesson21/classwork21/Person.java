package lesson21.classwork21;

import lesson21.classwork21.petClinic.Swimmable;

public class Person implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Человек очень круто поплыл");
    }
}
