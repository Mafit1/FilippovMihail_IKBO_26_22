public class TestBook {
    public static void main(String[] args) {
        Book Bk1 = new Book("1984",320);
        Book Bk2 = new Book("War and Peace", 1200);
        Book Bk3 = new Book(550);
        Bk1.ripOutPage();
        Bk2.ripOutPage();
        Bk3.ripOutPage();
        System.out.println(Bk1);
        System.out.println(Bk2);
        System.out.println(Bk3);
    }
}
