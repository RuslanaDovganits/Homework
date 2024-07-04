package lesson31.classwork31;

import java.util.List;

public class MyList {
    public void printMyList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

}

