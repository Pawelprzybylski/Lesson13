package Lesson10.Task3;

public class Main {
    public static void main(String[] args) {

        UrlValidator.validateUrl("http://www.onet.pl");
        UrlValidator.validateUrl("https://mailgoogle.com");
        UrlValidator.validateUrl("http://wiadmosci.onet.pl");
        UrlValidator.validateUrl(" http://onet.pl");

    }
}
