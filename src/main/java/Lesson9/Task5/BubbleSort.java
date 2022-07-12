package Lesson9.Task5;

public class BubbleSort<T> {

    public T[] bubbleSort(Integer[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    Integer temporary = elements[j + 1];
                    elements[j + 1] = elements[j];
                    elements[j] = temporary;
                }
            }
        }
        return elements;
    }

}
