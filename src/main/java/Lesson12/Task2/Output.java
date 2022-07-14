package Lesson12.Task2;

import java.util.Locale;

public class Output extends Thread{
    String text;

    public Output(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        System.out.println("Wpisany tekst z dużych liter: ");
        System.out.println(text.toUpperCase(Locale.ROOT));
    }
}
