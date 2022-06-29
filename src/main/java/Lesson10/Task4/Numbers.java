package Lesson10.Task4;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {

    Set<String> elements = new HashSet<>();

    public void addElements() {
        elements.add("342");
        elements.add("5.34");
        elements.add("756");
        elements.add("1.234e+07");
        elements.add("7.234243E-02");
        elements.add("6.09");
        elements.add("3457");
        elements.add("87");
        elements.add("1.0001");
        elements.add("3");
        elements.add("5");
    }

    public void printInteger() {
        Pattern pattern = Pattern.compile("[+-]?([0-9])?");
        Matcher matcher = pattern.matcher((CharSequence) elements);
        String numbers = matcher.toString();
    }

    public void printFloatingPoint() {
        Pattern pattern = Pattern.compile("^(\\-)?\\d*(\\.\\d+)?$");
        Matcher matcher = pattern.matcher((CharSequence) elements);
        String numbers = matcher.toString();
    }

    public void printScientificNotation() {
        Pattern pattern = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b");
        Matcher matcher = pattern.matcher((CharSequence) elements);
        String numbers = matcher.toString();
    }

}
