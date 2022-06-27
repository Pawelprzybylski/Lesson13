package Lesson9.Task2;
import java.util.ArrayDeque;
import java.util.Queue;

public class Fifo implements OwnQueue {

    @Override
    public boolean add(Integer e) {
        Queue<Integer> queue = new ArrayDeque<>();
        return queue.add(e);
    }

    @Override
    public Integer remove() {
        Queue<Integer> queue = new ArrayDeque<>();
        return queue.remove();
    }

    @Override
    public Integer element() {
        Queue<Integer> queue = new ArrayDeque<>();
        return queue.element();
    }


}
