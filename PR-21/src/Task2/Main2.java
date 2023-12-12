package Task2;

import Task1.ArrayQueue;

public class Main2 {
    public static void main(String[] args) {
        //arrayqueue
        System.out.println("task2.ArrayQueue");
        ArrayQueue<Character> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue('q');
        arrayQueue.enqueue('w');
        arrayQueue.enqueue('e');
        arrayQueue.enqueue('r');
        arrayQueue.enqueue('t');
        arrayQueue.enqueue('y');
        System.out.println("first deleted: " + arrayQueue.dequeue());
        System.out.println("first: " + arrayQueue.element());
        System.out.println("size: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("is empty: " + arrayQueue.isEmpty());
        System.out.println("-----------");


        //linked
        System.out.println("task2.LinkedQueue");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);
        System.out.println("first deleted: " + linkedQueue.dequeue());
        System.out.println("size: " + linkedQueue.size());
        linkedQueue.clear();
        System.out.println("is empty: " + linkedQueue.isEmpty());



    }
}