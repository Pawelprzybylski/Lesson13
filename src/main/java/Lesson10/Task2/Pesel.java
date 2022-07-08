package Lesson10.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    public static void validatePesel(CharSequence Pesel){
        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher matcher = pattern.matcher(Pesel);
        boolean matches = matcher.matches();
    }

    }


