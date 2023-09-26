public class Leg {
    private int lengthInCentimeters;
    private int shoeSize;

    public Leg(int lengthInCentimeters, int shoeSize) {
        this.lengthInCentimeters = lengthInCentimeters;
        this.shoeSize = shoeSize;
    }

    public int getLengthInCentimeters() {
        return lengthInCentimeters;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void walk() {
        System.out.println("Иду");
    }
}
