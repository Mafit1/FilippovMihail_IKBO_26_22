package Task1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex first = concreteFactory.createComplex();
        Complex second = concreteFactory.createComplex(1, 2);
        System.out.println("Complex first: " + first);
        System.out.println("Complex second: " + second);
    }
}