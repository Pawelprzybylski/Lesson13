package Lesson10.Task4;

import java.util.Set;
import java.util.regex.Pattern;

public class Numbers {

    private static final Pattern INTEGERS_PATTERN = Pattern.compile("^-?\\d+$");
    private static final Pattern FLOATING_POINT_PATTERN = Pattern.compile("^(\\-)?\\d*(\\.\\d+)?$");
    private static final Pattern SCIENTIFIC_NOTATION_PATTERN = Pattern.compile("\\b-?[1-9](?:\\.\\d+)?[Ee][-+]?\\d+\\b");


    public static void printInteger(Set<String> elements) {
        printForPattern(elements, INTEGERS_PATTERN);
    }

    public static void printFloatingPoint(Set<String> elements) {
        printForPattern(elements, FLOATING_POINT_PATTERN);
    }

    public static void printScientificNotation(Set<String> elements) {
        printForPattern(elements, SCIENTIFIC_NOTATION_PATTERN);
    }

    private static void printForPattern(Set<String> elements, Pattern pattern) {
        for (String element : elements) {
            if (pattern.matcher(element).find()) {
                System.out.println(element);
            }
        }
    }

}
