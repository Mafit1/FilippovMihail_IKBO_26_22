public class Test {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth");
        Animal animal1 = new Animal("Dog");
        System.out.println(planet1.getName());
        System.out.println(animal1.getName());

        Phone p1 = new Phone(20000);
        Pen pen1 = new Pen(10);
        System.out.println(p1.getPrice());
        System.out.println(pen1.getPrice());
    }
}
