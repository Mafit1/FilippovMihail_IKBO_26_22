public class Table extends Furniture {
    public Table(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public void use() {
        System.out.println("Работаю за " + getName());
    }
}
