public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.setColor("green");
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius());

        System.out.println();

        Circle circle1 = (Circle)shape1; // Downcast
        circle1.setRadius(12);
        circle1.setFilled(true);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        Shape shape2 = new Rectangle(1, 3, "yellow", false); // Upcast
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        // System.out.println(rectangle1.getLength());

        Rectangle rectangle1 = (Rectangle)shape2; // Downcast
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // Downcast
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
