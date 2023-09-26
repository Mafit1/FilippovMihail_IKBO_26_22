public class TestBall {
    public static void main(String[] args) {
        Ball B1 = new Ball("red", 5);
        Ball B2 = new Ball("blue", 2);
        Ball B3 = new Ball("green");
        Ball B4 = new Ball(20);
        B3.setRadius(99);
        B4.setColor("purple");
        B1.compress();
        B2.compress();
        B3.eat();
        System.out.println(B4);
    }
}
