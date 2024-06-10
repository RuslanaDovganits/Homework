package lesson26.homework26;

import java.util.Objects;

/*
1) Создатйте enum "Тип пользователя" с вариантами констант: USER, ADMIN
1) Необходимо создать класс "Человек", добавить в него поле "Тип пользователя" с енамом, остальные поля придумайте самостоятельно
2) Создать интерфейс Фильтр. В него добавьте метод, который принимает строку (веб-адрес, к которому подключается человек)
 и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
3) Реализуйте интерфейс таким образом:
3.1) Если это админ, то досту разрещен к любому сайту
3.2) Если это пользователь, то ему разрешен доступ только к сайтам, которые начинаются на "http://web-for-user"
4) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ
 */
public class Human {

    private String name;
    private int age;
    private UserType type;

    public Human(String name, int age, UserType type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name) && type == human.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }



}
