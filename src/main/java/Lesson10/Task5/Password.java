package Lesson10.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public void checkLength(CharSequence password) {
        Pattern pattern = Pattern.compile("(?!^[0-9]*$)(?=.*[A-Z]).{7}$ ((?!2021).)*$ ((?!21).)*$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
    }

}
