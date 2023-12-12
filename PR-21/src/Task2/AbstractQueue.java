package Task2;

public abstract class AbstractQueue<T> {
    private int first;
    private int last;
    private int size;
    private T[] elements;
    private int capacity;

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}