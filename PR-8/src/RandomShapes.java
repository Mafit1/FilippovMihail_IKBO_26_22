import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public RandomShapes() {
        Random rand = new Random();

        int x = 1;
        int y = 1;
        Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // случайный цвет

        // Случайно выбираем между кругом и прямоугольником
        if (rand.nextBoolean()) {
            int radius = rand.nextInt(50) + 10; // случайный радиус для круга
            shapes.add(new Circle(x, y, color, radius));
        } else {
            int width = rand.nextInt(100) + 10; // случайная ширина для прямоугольника
            int height = rand.nextInt(100) + 10; // случайная высота для прямоугольника
            shapes.add(new Rectangle(x, y, color, width, height));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

