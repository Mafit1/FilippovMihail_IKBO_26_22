public class Chair extends Furniture {
    public Chair(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public void use() {
        System.out.println("Сижу на " + getName());
    }
}

