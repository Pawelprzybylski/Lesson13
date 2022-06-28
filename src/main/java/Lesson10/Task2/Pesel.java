package Lesson10.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    public void checkLength(CharSequence Pesel) {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(Pesel);
        boolean matches = matcher.matches();
    }

    public void checkPropiety(CharSequence Pesel) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(Pesel);
        boolean matches = matcher.matches();
    }

}
