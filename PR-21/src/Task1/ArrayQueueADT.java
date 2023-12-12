package Task1;

import java.util.Arrays;

public class ArrayQueueADT <T> {
    private static int first = 0;
    private static int last = -1;
    private static int size = 0;
    private static final int capacity = 10;
    private final T[] elements = (T[])new Object[capacity];

    public <T> void enqueue(ArrayQueueADT<T> que, T val) {
        if (size == capacity) {
            System.out.println("Queue overflow");
            return;
        }
        last = (last + 1);
        que.elements[last] = val;
        size++;
    }

    public static <T> T element(ArrayQueueADT<T> que) {
        if (isEmpty(que)) {
            System.out.println("Queue is empty");
            return null;
        }
        return que.elements[first];
    }

    public static <T> T dequeue(ArrayQueueADT<T> que) {
        if (isEmpty(que)) {
            System.out.println("Queue is empty");
            return null;
        }

        T removed = que.elements[first];
        first = (first + 1);
        size--;
        return removed;
    }

    public static <T> int size() {
        return size;
    }

    public static <T> boolean isEmpty(ArrayQueueADT<T> que) {
        return size == 0;
    }

    public static <T> void  clear(ArrayQueueADT<T> que) {
        Arrays.fill(que.elements, null);
        size = 0;
        first = 0;
        last = -1;
    }
}