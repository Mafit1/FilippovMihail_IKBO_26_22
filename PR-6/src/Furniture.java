public abstract class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    // Абстрактный метод, который будет реализован в подклассах
    public abstract void use();

    // Общий метод для всех видов мебели
    public void assemble() {
        System.out.println("Собираю " + name);
    }
}

