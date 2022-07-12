package Lesson10.Task6;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;

public class BirthInformation {

    public static void printInformation(int rrrr, int mm, int dd) {

        LocalDate dateOfBirth = LocalDate.of(rrrr, mm, dd);

        ZonedDateTime zone = ZonedDateTime.now((ZoneId.systemDefault()));
        LocalDate actualDate = zone.toLocalDate();
        long age = ChronoUnit.YEARS.between(dateOfBirth, actualDate);

        DayOfWeek day = dateOfBirth.getDayOfWeek();
        int dayOfYear = dateOfBirth.get(WeekFields.ISO.weekOfYear());

        System.out.println("You are " + age + " years old");
        System.out.println("You were born on: " + day);
        System.out.println("You were born in: " + dayOfYear + " weeks");

    }

}

