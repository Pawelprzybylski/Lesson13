package Lesson12.Task2;

public class Input extends Thread {

String text;

    public Input(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        System.out.println("Twój wpisany tekst:");
        System.out.println(text);
        }

    }


