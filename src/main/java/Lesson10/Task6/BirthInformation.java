package Lesson10.Task6;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;

public class BirthInformation {

    public static void printInformationAboutBirth(String birthDate) {

        var parse = LocalDate.parse(birthDate);

        ZonedDateTime zone = ZonedDateTime.now((ZoneId.systemDefault()));
        LocalDate actualDate = zone.toLocalDate();
        long age = ChronoUnit.YEARS.between(parse, actualDate);

        DayOfWeek day = parse.getDayOfWeek();
        int dayOfYear = parse.get(WeekFields.ISO.weekOfYear());

        System.out.println("You are " + age + " years old");
        System.out.println("You were born on: " + day);
        System.out.println("You were born in: " + dayOfYear + " weeks");

    }

}

