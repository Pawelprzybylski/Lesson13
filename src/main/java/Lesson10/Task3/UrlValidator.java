package Lesson10.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/" +
                "|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$");
        Matcher matcher1 = pattern.matcher("http://www.onet.pl");
        Matcher matcher2 = pattern.matcher("https://mailgoogle.com");
        Matcher matcher3 = pattern.matcher("http://wiadmosci.onet.pl");
        Matcher matcher4 = pattern.matcher(" http://onet.pl");

        boolean matches1 = matcher1.find();
        boolean matches2 = matcher2.find();
        boolean matches3 = matcher3.find();
        boolean matches4 = matcher4.find();

        System.out.println(matches1);
        System.out.println(matches2);
        System.out.println(matches3);
        System.out.println(matches4);
    }

}
