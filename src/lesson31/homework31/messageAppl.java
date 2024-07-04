package lesson31.homework31;

import java.util.Scanner;

public class messageAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message<String> message = new Message<>();
        Message<Integer> message1 = new Message<>();

        System.out.println("What type of message do u want to sent? \n1.Number\n2.String");
        int choiceNumber = scanner.nextInt();

        if (choiceNumber == 1) {
            int yourNumber = scanner.nextInt();
            message1.setObject(yourNumber);
            // message1.getObject();
            System.out.println("You number is: " + yourNumber);
        } else if (choiceNumber == 2) {
            String yourMessage = scanner.next();
            message.setObject(yourMessage);
            System.out.println("You message is: " + yourMessage);

        } else {
            System.out.println("You number is Incorrect!!!");
        }

    }
}

