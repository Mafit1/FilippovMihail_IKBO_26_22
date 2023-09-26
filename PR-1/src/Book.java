public class Book {
    private String name;
    private int pages;
    public Book(String n, int p) {
        name = n;
        pages = p;
    }
    public Book(String n) {
        name = n;
        pages = 1;
    }
    public Book(int p) {
        name = "Book";
        pages = p;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getName() {
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString() {
        return this.name+", pages "+this.pages;
    }
    public void ripOutPage() {
        pages -= 1;
        System.out.println("You ripped out 1 page from book named " + name);
    }
}
