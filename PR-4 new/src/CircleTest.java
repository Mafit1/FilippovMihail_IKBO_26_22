public class CircleTest {
    public static void main(String[] args) {
        // Создаем объект окружности с радиусом 5.0
        Circle circle = new Circle(5.0);

        // Получаем радиус и выводим его
        System.out.println("Радиус окружности: " + circle.getRadius());

        // Вычисляем и выводим площадь окружности
        System.out.println("Площадь окружности: " + circle.calculateArea());

        // Вычисляем и выводим длину окружности
        System.out.println("Длина окружности: " + circle.calculateCircumference());

        // Изменяем радиус окружности
        circle.setRadius(7.0);
        System.out.println("Обновленный радиус окружности: " + circle.getRadius());
    }
}

