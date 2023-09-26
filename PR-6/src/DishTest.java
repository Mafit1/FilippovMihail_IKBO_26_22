public class DishTest {
    public static void main(String[] args) {
        // Создаем тарелку и чашку
        Plate plate = new Plate("Керамика", 20.0, 4);
        Cup cup = new Cup("Стекло", 10.0, true);

        // Используем и чистим посуду
        plate.use();
        plate.clean();

        cup.use();
        cup.clean();
    }
}

