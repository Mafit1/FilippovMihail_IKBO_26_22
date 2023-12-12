package Task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int first = 0;
    private static int last = -1;
    private static int size = 0;
    private static final int capacity = 10;
    private static final Integer[] elements = new Integer[capacity];

    public void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue overflow");
            return;
        }
        last = (last + 1);
        elements[last] = val;
        size++;
    }

    public int element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        return elements[first];
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }

        int removed = elements[first];
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