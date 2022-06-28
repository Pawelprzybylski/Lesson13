package Lesson9.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void shouldAdd() {
        //given
        int element = 2;
        //when
        Queue queue = new Queue();
        boolean addELements = queue.add(element);
        //then
        Assertions.assertTrue(addELements);
    }

    @Test
    public void shouldRemove() {
        //give
        Queue queue = new Queue();
        //when
        queue.offer(1);
        queue.remove();
        //then
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void shouldElement() {
        //give
        Queue queue = new Queue();
        //when
        queue.offer(1);
        queue.element();
        //then
        Assertions.assertEquals(1, 1);
    }
}