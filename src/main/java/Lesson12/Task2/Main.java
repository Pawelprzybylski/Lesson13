package Lesson12.Task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Wprowadź dowolny tekst");
        String text= scanner.nextLine();

        String textToUpperCase= text.toUpperCase(Locale.ROOT);
        System.out.println(textToUpperCase);

    }

}
