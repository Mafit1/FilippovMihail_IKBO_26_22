import java.util.Scanner;

public class Exception2rework {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please enter a non-zero integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Exception2rework demo = new Exception2rework();
        demo.exceptionDemo();
    }
}
