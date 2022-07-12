package Lesson10.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static void validateUrl(String url) {

        Pattern pattern = Pattern.compile("^(http://www.|http://" +
                "|https://)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$");
        Matcher matcher = pattern.matcher(url);
        boolean matches = matcher.find();
        System.out.println(matches);
    }

}
