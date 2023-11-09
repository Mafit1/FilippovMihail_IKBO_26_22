import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "sample.txt"; // Имя файла, в котором будем хранить информацию

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Записать информацию в файл");
            System.out.println("2. Вывести информацию из файла");
            System.out.println("3. Заменить информацию в файле");
            System.out.println("4. Добавить информацию в конец файла");
            System.out.println("5. Выйти");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем перевод строки после числа

            switch (choice) {
                case 1:
                    writeToFile(filename, scanner);
                    break;
                case 2:
                    readFromFile(filename);
                    break;
                case 3:
                    replaceInFile(filename, scanner);
                    break;
                case 4:
                    appendToFile(filename, scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    public static void writeToFile(String filename, Scanner scanner) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            System.out.println("Введите информацию для записи в файл:");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String filename) {
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            System.out.println("Содержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceInFile(String filename, Scanner scanner) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("Файл не существует. Создайте файл и запишите в него информацию сначала.");
                return;
            }

            System.out.println("Введите информацию для замены в файле:");
            String replaceText = scanner.nextLine();
            System.out.println("Введите новую информацию для записи в файл:");
            String newText = scanner.nextLine();

            String fileContent = "";
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent += line + System.lineSeparator();
                }
            }

            fileContent = fileContent.replace(replaceText, newText);

            try (FileWriter writer = new FileWriter(filename, false)) {
                writer.write(fileContent);
                System.out.println("Информация успешно заменена в файле.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void appendToFile(String filename, Scanner scanner) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            System.out.println("Введите информацию для добавления в конец файла:");
            String input = scanner.nextLine();
            writer.write(System.lineSeparator() + input);
            System.out.println("Информация успешно добавлена в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
