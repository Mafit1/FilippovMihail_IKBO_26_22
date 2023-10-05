import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationExample extends JPanel implements ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int FRAME_DELAY = 200; // Задержка между кадрами (в миллисекундах)

    private ImageIcon[] frames;
    private int currentFrameIndex;

    public AnimationExample() {
        frames = new ImageIcon[3]; // Замените 4 на количество кадров в вашей анимации

        // Загрузка изображений для каждого кадра анимации
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("D:\\frames\\frame" + (i + 1) + ".png");
        }

        currentFrameIndex = 0;

        // Запускаем таймер для анимации
        Timer timer = new Timer(FRAME_DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        frames[currentFrameIndex].paintIcon(this, g, 0, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Переключаемся на следующий кадр
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        repaint(); // Запускаем перерисовку панели
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Пример анимации");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnimationExample animationPanel = new AnimationExample();
        frame.add(animationPanel);

        frame.setVisible(true);
    }
}

