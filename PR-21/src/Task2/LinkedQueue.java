package Task2;

import java.util.NoSuchElementException;

public class LinkedQueue<T>extends AbstractQueue<T> implements Queue<T> {
    public class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    private int size = 0;
    private Node<T> first;
    private Node<T> last;
    public void enqueue(T item){
        Node<T> newNode = new Node<T>(item);
        if (isEmpty()){
            first = newNode;
            last = newNode;
        }
        else{
            first.next = newNode;
            last = newNode;
        }
        size++;
    };

    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        else{
            size--;
            T item = first.data;
            first.next = first;
            if (isEmpty()){
                last = null;
            }
            return item;
        }
    }
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }
        else return first.data;
    };

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
}