import java.util.Objects;
import java.util.Scanner;
public class ThrowsDemo2 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "none")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
        throwsDemo2.getKey();
    }
}