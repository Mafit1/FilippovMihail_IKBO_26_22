public abstract class Dish {
    private String material;
    private double diameter;

    public Dish(String material, double diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public double getDiameter() {
        return diameter;
    }

    // Абстрактный метод, который будет реализован в подклассах
    public abstract void use();

    // Общий метод для всех посуд
    public void clean() {
        System.out.println("Посуда из " + material + " диаметром " + diameter + " см помыта.");
    }
}

