public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
            System.out.println("Successful");
        }catch (NullPointerException e){
            System.out.println("Exception found: " + e.getMessage());
        }
        // do something with the key
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        String str = null;
        throwsDemo.getDetails(str);

    }
}