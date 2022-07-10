package Lesson11.Task1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Numbers {
    public static void main(String[] args) {


        IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers
                .filter(integer  -> (integer  % 3) == 0)
                .boxed()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}

