public final class Drink implements Item {
    private String name;
    private String description;
    private int price;

    public Drink(String name, String description){
        this.name = name;
        this.description = description;
        price = 0;
    }

    public Drink(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{"+ name + ", " + price +"," + description + "}";
    }
}