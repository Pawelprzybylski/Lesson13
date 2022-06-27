package Lesson9.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class FifoTest {

    @Test
    public void shouldAdd() {
        //given
        int element = 2;

        //when
        Fifo fifo = new Fifo();
        boolean addELements = fifo.add(element);

        //then
        Assertions.assertTrue(addELements);


    }

    @Test
    public void shouldRemove() {
        //give
        Queue<Integer> queue = new ArrayDeque<>();
        //when
        Fifo fifo = new Fifo();
       queue.add(1);
       fifo.remove();


        Assertions.assertEquals(1, 1);


    }
}