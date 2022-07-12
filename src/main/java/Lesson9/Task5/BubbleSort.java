package Lesson9.Task5;

public class BubbleSort<T> {

    public T[] bubbleSort(T[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    Integer temporary = (Integer) elements[j + 1];
                    elements[j + 1] = elements[j];
                    elements[j] = (T) temporary;
                }
            }
        }
        return elements;
    }

}
