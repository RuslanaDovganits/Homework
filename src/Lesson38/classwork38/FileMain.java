package Lesson38.classwork38;

import java.io.*;

public class FileMain {
    public static void main(String[] args) {

        try {
            File file = new File("Hello.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            System.out.println("Нашли  файл");



        } catch (FileNotFoundException e) {
            System.out.println("Простите но такого файла нету");
        }
        catch (IOException e){
            System.out.println("Что то н так с четением файла");
        }
        finally {
            System.out.println("Тут отработал блок finally");
        }
        System.out.println("Программа все равно работает");
    }
}
