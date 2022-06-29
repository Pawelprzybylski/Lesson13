package Lesson10.Task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class YearOfBorn {

    public void getInformationAboutBirth(int RRRR, int MM, int DD) {

        LocalDate dateOfBirth = LocalDate.of(RRRR, MM, DD);

        LocalDate date = LocalDate.of(2022, 06, 29);

        try {
            Period age = Period.between(dateOfBirth, date);
            DayOfWeek week = dateOfBirth.getDayOfWeek();
            int dayOfYear = dateOfBirth.getDayOfYear();

        } catch (NullPointerException e) {
            System.out.println("Wprowadzano nieprawidłową wartość");
        }

    }
}
