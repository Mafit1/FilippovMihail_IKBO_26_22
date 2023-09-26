public class Head {
    private String hairColor;
    private int numberOfEyes;

    public Head(String hairColor, int numberOfEyes) {
        this.hairColor = hairColor;
        this.numberOfEyes = numberOfEyes;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void talk() {
        System.out.println("Говорю");
    }
}