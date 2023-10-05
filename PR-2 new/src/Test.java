import java.util.Arrays;

public class Test {
    private int[] array = new int[]{1, 2, 3, 4, 5};
    private int f1;
    public double[] ten = new double[10];
    public int[] numbers = new int[10];
    public int sumOfArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public int sumOfArray2() {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
    public int sumOfArray3() {
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while(i < array.length);
        return sum;
    }
    public void harmonic() {
        for (int i = 0; i < 10; i++) {
            ten[i] = (double) 1 / (i + 1);
        }
    }
    public void randNumbers() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
    }
    public void sortNumbers() {
        Arrays.sort(numbers);
    }
    public int factorial(int f) {
        f1 = 1;
        for (int i = 2; i <= f; i++) {
            f1 *= i;
        }
        return f1;
    }
}
