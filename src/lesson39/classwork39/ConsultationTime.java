package lesson39.classwork39;

import java.time.*;

public class ConsultationTime {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        //ZonedDateTime
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Australia/Sydney"));

        //Instant
        Instant instantSecond = localDateTime.toInstant(ZoneOffset.ofHoursMinutes(3, 0));
        Instant instant = zonedDateTime.toInstant();

        //Long
        long timestamp = instant.getEpochSecond() * 1000;
        System.out.println(timestamp);

        //Instant
        Instant instantThird = Instant.ofEpochMilli(timestamp);

        //ZonedDateTime
        ZonedDateTime zonedDateTimeSecond = instantThird.atZone(ZoneId.of("Australia/Sydney"));

        //LocalDateTime
        LocalDateTime localDateTime1 = zonedDateTimeSecond.toLocalDateTime();

        //LocalTime LocalDate
        LocalTime localTime1 = localDateTime1.toLocalTime();
        LocalDate localDate1 = localDateTime1.toLocalDate();

        System.out.println(localDate1);
        System.out.println(localTime1);


    }
}
