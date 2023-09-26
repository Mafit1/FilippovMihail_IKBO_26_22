public class Pug extends Dog {
    public Pug(String name, int age) {
        super(name, age, "Мопс");
    }

    @Override
    public void bark() {
        System.out.println("Мопс по кличке " + getName() + " лает (по-доброму)");
    }
}
