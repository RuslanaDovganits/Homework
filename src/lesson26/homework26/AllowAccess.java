package lesson26.homework26;

public class AllowAccess implements  Filter {
    @Override
    public boolean isAllowingAccess(String str, UserType type) {
    if (!str.contains("http://web-for-user") && type == UserType.USER) {
        System.out.println("У вас нету доступа к этой страничке!");
            return false;
        } else {
            System.out.println("Добро пожаловать! Вы имеете доступ к этой страничке!");

        }
        return true;

    }
}
