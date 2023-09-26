public class Plate extends Dish {
    private int sideHeight;

    public Plate(String material, double diameter, int sideHeight) {
        super(material, diameter);
        this.sideHeight = sideHeight;
    }

    @Override
    public void use() {
        System.out.println("Использую тарелку с высотой бортов равной " + sideHeight);
    }
}

