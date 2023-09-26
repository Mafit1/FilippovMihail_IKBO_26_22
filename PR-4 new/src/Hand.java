public class Hand {
    private int fingers;
    private boolean hasThumb;

    public Hand(int fingers, boolean hasThumb) {
        this.fingers = fingers;
        this.hasThumb = hasThumb;
    }

    public int getFingers() {
        return fingers;
    }

    public boolean hasThumb() {
        return hasThumb;
    }

    public void wave() {
        System.out.println("Машу рукой");
    }
}