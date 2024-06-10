package lesson26.homework26;
/* 2) Создать интерфейс Фильтр. В него добавьте метод,
 который принимает строку (веб-адрес, к которому подключается человек)
 и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
 */

public interface Filter {

    boolean isAllowingAccess(String str,UserType type);

}
