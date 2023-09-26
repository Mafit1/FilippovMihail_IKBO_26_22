public class Cup extends Dish {
    private boolean handle;

    public Cup(String material, double diameter, boolean handle) {
        super(material, diameter);
        this.handle = handle;
    }

    @Override
    public void use() {
        if (handle) {
            System.out.println("Пью из чашки с ручкой.");
        } else {
            System.out.println("Пью из чашки без ручки.");
        }
    }
}
