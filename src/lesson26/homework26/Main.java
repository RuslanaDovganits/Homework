package lesson26.homework26;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Ruslana",38, UserType.USER);
        Human human2 = new Human("Ivan", 45,UserType.USER);
        Human human3 = new Human("Svetlana",56, UserType.ADMIN);

        AllowAccess allowAccess = new AllowAccess();

        allowAccess.isAllowingAccess("http://web-for-user",human.getType());
        allowAccess.isAllowingAccess("http://web-for-us",human2.getType());
        allowAccess.isAllowingAccess("http://web-for-user",human3.getType());




    }
}
