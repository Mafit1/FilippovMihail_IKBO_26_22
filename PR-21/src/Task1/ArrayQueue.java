package Task1;

import java.util.Arrays;

public class ArrayQueue<T> {
    private static int first = 0;
    private static int last = -1;
    private static int size = 0;
    private static final int capacity = 10;
    private final T[] elements = (T[]) new Object[capacity];


    public void enqueue(T val) {
        if (size == capacity) {
            System.out.println("Queue overflow");
            return;
        }
        last = (last + 1);
        elements[last] = val;
        size++;
    }

    public T element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return elements[first];
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T removed = elements[first];
        first = (first + 1);
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        first = 0;
        last = -1;
    }
}