package Task2;

public class ArrayQueue<T> extends AbstractQueue<T>implements Queue<T>{
    private int first;
    private int last;
    private int size;
    private T[] elements;
    private int capacity;

    public ArrayQueue(int capacity){
        this.size = 0;
        this.first = 0;
        this.last = -1;
        this.elements = (T[]) new Object[capacity];
        this.capacity = capacity;
    };

    public void enqueue(T t){
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        last = (last + 1);
        elements[last] = t;
        size++;
    };

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to return.");
            return null;
        }

        return elements[first];
    }
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        T removedItem = elements[first];
        first = (first + 1);
        size--;
        return removedItem;
    }
    public void clear(){
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }
        size = 0;
        first = 0;
        last = -1;
    };
}