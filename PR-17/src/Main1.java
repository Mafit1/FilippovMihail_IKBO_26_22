// task 1

import java.util.Objects;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            if (isValidINN(inn)) {
                System.out.println("Заказ оформлен на: " + name);
            } else {
                throw new Exception("Недействительный номер ИНН.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean isValidINN(String inn) {
        if (inn.length() != 10) {
            return false;
        }

        return checkINN10Digits(inn);

    }

    private static boolean checkINN10Digits(String inn) {
        if (Objects.equals(inn, "1234567890")) {
            return true;
        }
        return false;
    }


}