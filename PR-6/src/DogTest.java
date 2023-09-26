public class DogTest {
    public static void main(String[] args) {
        // Создаем экземпляры собак разных пород
        Pug pug = new Pug("Шарик", 3);
        Bulldog bulldog = new Bulldog("Макс", 4);

        // Вызываем методы и выводим характеристики каждой собаки
        pug.bark();
        bulldog.bark();

        System.out.println(pug.getName() + " возраст: " + pug.getAge() + " лет");
        System.out.println(bulldog.getName() + " возраст: " + bulldog.getAge() + " лет");
    }
}

