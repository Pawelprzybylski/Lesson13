package Lesson10.Task4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> elements = new HashSet<>();

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

        System.out.println("Liczby całkowite: ");
        Numbers.printInteger(elements);

        System.out.println("Liczby zmiennoprzecinkowe: ");
        Numbers.printFloatingPoint(elements);

        System.out.println("Liczby w notacji naukowej: ");
        Numbers.printScientificNotation(elements);

    }

}
