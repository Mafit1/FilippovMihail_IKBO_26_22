public class Circle {
    private double radius; // Свойство радиуса окружности

    // Конструктор для создания объекта окружности с заданным радиусом
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для изменения радиуса окружности
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
