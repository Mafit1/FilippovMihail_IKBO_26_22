import java.util.Scanner;
public class var12 {
    private static String out = "";
    public static void func() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number != 0) {
            if (number % 2 != 0) {
                out += number;
                func();
            } else {
                func();
            }
        } else {
            System.out.println(out);
            return;
        }
    }

    public static void main(String[] args) {
        func();
    }
}
