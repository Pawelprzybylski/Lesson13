package Lesson10.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final Pattern PASSWORD_PATTERN = Pattern.compile("(?=.*[0-9])(?=.*[A-Z]).{7,}(-\21+$)(-\2021+$)");

    public static void validatePassword(String password) {

        Matcher matcher = PASSWORD_PATTERN.matcher(password);

        if (matcher.matches()) {
            System.out.println("Twoje hasło jest poprawne");
        } else System.out.println("Twoje hasło jest niepoprawne");
    }

}
