package lesson26.homework26;

public enum UserType {
    USER("Пользователь"),
    ADMIN("Администратор");

    private  String roleName;

    UserType(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "roleName='" + roleName + '\'' +
                '}';
    }


}






