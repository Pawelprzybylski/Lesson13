package Lesson12.Task4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Thread t1 = new Thread(() -> {

            double average = 0.0;

            for (double averageNumbers : numbers) {
                average += averageNumbers;
                average /= numbers.size();
            }

            System.out.println("średnia wprowadzonych liczby: ");
            System.out.println(average);
        }

        );


        Thread t2 = new Thread(() -> {

            int variable = 0;

            for (int addnumbers : numbers) {
                variable += addnumbers++;
            }

            System.out.println("suma wprowadzonych liczby: ");
            System.out.println(variable);

        });

        t1.start();
        t2.start();

    }

}
