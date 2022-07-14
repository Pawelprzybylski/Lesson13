package Lesson9.Task5;

public class BubbleSort {

  public static <T extends Comparable<T>> T[] bubbleSort(T[] elements) {
      for (int i = 0; i < elements.length; i++) {
          for (int j = 0; j < elements.length - 1; j++) {
              if (elements[j].compareTo(elements[j + 1]) > 0) {
                  T temporary = elements[j + 1];
                  elements[j + 1] = elements[j];
                  elements[j] = temporary;
              }
          }
      }
      return elements;
  }

}
