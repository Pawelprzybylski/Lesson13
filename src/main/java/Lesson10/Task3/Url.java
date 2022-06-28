package Lesson10.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)");
        Matcher matcher1 = pattern.matcher("http://www.onet.pl");
        Matcher matcher2 = pattern.matcher("https://mail.google.com");
        Matcher matcher3 = pattern.matcher("http://wiadmosci.onet.pl");
        Matcher matcher4 = pattern.matcher(" http://onet.pl");

        boolean matches1 = matcher1.find();
        boolean matches2 = matcher2.find();
        boolean matches3 = matcher3.find();
        boolean matches4 = matcher4.find();
    }
}
