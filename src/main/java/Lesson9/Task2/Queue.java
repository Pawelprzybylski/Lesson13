package Lesson9.Task2;

import java.util.ArrayDeque;

public class Queue implements OwnQueue {

    java.util.Queue<Integer> queue = new ArrayDeque<>();

    public void offer(int e) {
        queue.offer(e);
    }

    @Override
    public boolean add(Integer e) {
        return queue.add(e);
    }

    @Override
    public Integer remove() {
        return queue.remove();
    }

    @Override
    public Integer element() {
        return queue.element();
    }

}
