package Lesson38.classwork38;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AutocloseableExample {

    public static void main(String[] args) {
        //try-with-resources
        //Scanner scanner = new Scanner(System.in);
        //
        //int a = scanner.nextInt();
        //
        //scanner.close();


        File file = new File("hello.txt");


        try (FileReader fileReader = new FileReader(file);
             FileReader fileReader1 = new FileReader(file)) {
            int a = fileReader.read();
        }
        catch (IOException e) {
            System.out.println("тут была ошибка");
        }

    }
}