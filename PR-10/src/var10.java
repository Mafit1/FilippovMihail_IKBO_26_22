public class var10 {
    public static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            int lastDigit = n % 10;
            return reverseHelper(n / 10, reversed * 10 + lastDigit);
        }
    }

    public static void main(String[] args) {
        int n = 809;
        int reversed = reverse(n);
        System.out.println("Исходное число: " + n);
        System.out.println("Число с обратным порядком цифр: " + reversed);
    }
}

