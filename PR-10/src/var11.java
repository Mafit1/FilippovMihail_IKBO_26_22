import java.util.Scanner;

public class var11 {
    public static int countOnes(Scanner scanner) {
        int number = scanner.nextInt();

        if (number == 0) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                return 0;
            } else {
                return countOnes(scanner);
            }
        }

        if (number == 1) {
            return 1 + countOnes(scanner);
        } else {
            return countOnes(scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnes(scanner);
        System.out.println("Количество вхождений числа 1: " + count);
    }
}

