public class BookTest {
    public static void main(String[] args) {
        // Создаем объект книги
        Book book = new Book("Автор книги", "Название книги", 2023);

        // Получаем информацию о книге и выводим ее
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменяем автора книги
        book.setAuthor("Новый автор книги");
        System.out.println("Обновленный автор: " + book.getAuthor());

        // Изменяем год написания книги
        book.setYear(2024);
        System.out.println("Обновленный год написания: " + book.getYear());
    }
}

