import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}