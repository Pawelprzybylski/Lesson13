package Lesson10.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void validatePassword(CharSequence password) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z]).{7,}(-\21+$)(-\2021+$)");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();

        if(matches==true){
            System.out.println("Twoje hasło jest poprawne");
        }
        else System.out.println("Twoje hasło jest niepoprawne");
    }

}
