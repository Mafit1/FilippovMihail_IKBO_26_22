package Task1;

public class Main {
    public static void main(String[] args) {
        //Module
        //обычная очередь
        System.out.println("task1.ArrayQueueModule");
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        arrayQueueModule.enqueue(5);
        arrayQueueModule.enqueue(10);
        arrayQueueModule.enqueue(15);
        arrayQueueModule.enqueue(20);
        arrayQueueModule.enqueue(25);
        System.out.println("first deleted: " + arrayQueueModule.dequeue()); //5
        System.out.println("first: " + arrayQueueModule.element());         //10
        System.out.println("size: " + arrayQueueModule.size());             //4
        arrayQueueModule.clear();
        System.out.println("is empty: " + arrayQueueModule.isEmpty());      //true
        System.out.println("-----------");

        //ADT
        //явная передача ссылки на экземпляр, объект не создается, работает с абстрактрыми функциями
        System.out.println("task1.ArrayQueueADT");
        ArrayQueueADT<String> arrayQueueADT= new ArrayQueueADT<>();
        arrayQueueADT.enqueue(arrayQueueADT, "str1");
        arrayQueueADT.enqueue(arrayQueueADT, "str2");
        arrayQueueADT.enqueue(arrayQueueADT, "str3");
        arrayQueueADT.enqueue(arrayQueueADT, "str4");
        arrayQueueADT.enqueue(arrayQueueADT, "str5");
        System.out.println("first deleted: " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("first: " + ArrayQueueADT.element(arrayQueueADT));
        System.out.println("size: " + ArrayQueueADT.size());
        ArrayQueueADT.clear(arrayQueueADT);
        System.out.println("is empty: " + ArrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println("-----------");

        //ArrQueue
        //неявная передача ссылки на экземпляр, создает объект, работает с объектом
        System.out.println("task1.ArrayQueue");
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
    }
}