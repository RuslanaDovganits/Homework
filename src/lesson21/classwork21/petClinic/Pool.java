package lesson21.classwork21.petClinic;

public class Pool {

    public void goSwimming(Swimmable abc) {
        System.out.println("Мы берем объект и кидаем его в бассейн");
        abc.swim();
        System.out.println("Все успешно");
    }
}