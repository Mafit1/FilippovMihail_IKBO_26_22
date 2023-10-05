import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        Test t = new Test();
        // 1
        System.out.println(t.sumOfArray());
        System.out.println(t.sumOfArray2());
        System.out.println(t.sumOfArray3());
        // 2
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // 3
        t.harmonic();
        System.out.println(Arrays.toString(t.ten));
        // 4
        t.randNumbers();
        System.out.println(Arrays.toString(t.numbers));
        t.sortNumbers();
        System.out.println(Arrays.toString(t.numbers));
        // 5
        System.out.println(t.factorial(5));
    }
}

