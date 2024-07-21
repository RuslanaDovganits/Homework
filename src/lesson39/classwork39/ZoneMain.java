package lesson39.classwork39;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneMain {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);


        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Karachi")));
        System.out.println(zonedDateTime.withZoneSameLocal(ZoneId.of("Asia/Karachi")));

        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime localDateTime1 = LocalDateTime.now();


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yy HH:mm:ss");
        String string = LocalDateTime.now().format(dateTimeFormatter);

        System.out.println(string);

    }
}
