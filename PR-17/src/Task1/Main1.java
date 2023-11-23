package Task1;

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
        if (inn.length() != 10 && inn.length() != 12) {
            return false;
        }

        try {
            long num = Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }

        if (inn.length() == 10) {
            return checkINN10Digits(inn);
        } else {
            return checkINN12Digits(inn);
        }
    }

    private static boolean checkINN10Digits(String inn) {
        int[] nums = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(inn.charAt(i)) * nums[i];
        }

        int remainder = sum % 11;
        if (remainder == 10) {
            remainder = 0;
        }

        int expectedCheckDigit = Character.getNumericValue(inn.charAt(9));

        return remainder == expectedCheckDigit;
    }

    private static boolean checkINN12Digits(String inn) {
        int[] nums1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] nums2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 10; i++) {
            sum1 += Character.getNumericValue(inn.charAt(i)) * nums1[i];
            sum2 += Character.getNumericValue(inn.charAt(i)) * nums2[i];
        }

        int remainder1 = sum1 % 11;
        if (remainder1 == 10) {
            remainder1 = 0;
        }

        int remainder2 = sum2 % 11;
        if (remainder2 == 10) {
            remainder2 = 0;
        }

        int expectedCheckDigit1 = Character.getNumericValue(inn.charAt(10));
        int expectedCheckDigit2 = Character.getNumericValue(inn.charAt(11));

        return remainder1 == expectedCheckDigit1 && remainder2 == expectedCheckDigit2;
    }
}