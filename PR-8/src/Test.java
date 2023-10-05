import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");

        frame.setLayout(new GridLayout(4, 5));
        frame.setSize(900, 900);
        for (int i = 0; i < 20; i++) {
            RandomShapes panel = new RandomShapes();
            frame.add(panel);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
