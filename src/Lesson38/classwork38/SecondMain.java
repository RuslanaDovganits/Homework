package Lesson38.classwork38;
import java.util.Random;

public class SecondMain {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isNotOk = random.nextBoolean();

        if (isNotOk) {
            RuntimeException runtimeException = new RuntimeException();
            throw runtimeException;
        }


                boolean isNoOk = random.nextBoolean();

                if (isNoOk) {
                    throw new RuntimeException();
                }
            }
        }
