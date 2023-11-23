public class Exception1rework {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 e1 = new Exception1();
        e1.exceptionDemo();

        Exception1rework e1r = new Exception1rework();
        e1r.exceptionDemo();
    }
}
