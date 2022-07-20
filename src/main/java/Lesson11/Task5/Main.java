package Lesson11.Task5;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> inputWords = new ArrayList();
        inputWords.add("Szpital");
        inputWords.add("ALa");
        inputWords.add("Pies");

        Set<Character> letters = new HashSet<>();

        inputWords.forEach(s -> {
            for (int i = 0; i < s.length(); i++) {
                letters.add(s.toUpperCase().charAt(i));
            }
        });

        System.out.println(letters);

    }

}
