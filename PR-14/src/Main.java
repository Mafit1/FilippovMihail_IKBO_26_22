import java.util.concurrent.ConcurrentLinkedQueue;
public class Main extends WaitList<Integer>{
    public static void main(String[] args) {
        BoundedWaitList <Integer> boundedWaitList = new BoundedWaitList<>(7);
        for (int i = 0; i < 10; i++) {
            boundedWaitList.add(i);
        }
        System.out.println(boundedWaitList);

    }
}