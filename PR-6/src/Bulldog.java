public class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age, "Бульдог");
    }

    @Override
    public void bark() {
        System.out.println("Бульдог по кличке " + getName() + " лает (злобно)");
    }
}
