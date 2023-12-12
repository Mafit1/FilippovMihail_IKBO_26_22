public final class Dish implements Item {
    private String name;
    private int price;
    private String description;
    public Dish(String name, String description) throws IllegalArgumentException{
        if (name == null || description == null)
            throw new IllegalArgumentException("Name or description is empty string");
        this.name = name;
        this.description = description;
        price = 0;
    }
    public Dish(String name, String description, int price) throws IllegalArgumentException{
        if (name == null || description == null)
            throw new IllegalArgumentException("Name or description is empty string");
        if (price < 0)
            throw new IllegalArgumentException("Price is lower than 0 (бесплано?!)");
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
        return "Dish{"+ name + ", " + price +"," + description + "}";
    }
}