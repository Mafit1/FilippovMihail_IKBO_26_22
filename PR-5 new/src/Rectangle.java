public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        super();
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double lenght) {
        super();
        this.width = width;
        this.length = lenght;
    }
    public Rectangle(double width,  double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double lenght) {
        this.length = lenght;
    }
    public double getArea() {
        return width *  length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
