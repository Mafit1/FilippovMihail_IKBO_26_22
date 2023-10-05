import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDisplay extends JFrame {
    private JLabel imageLabel;

    public ImageDisplay(String imagePath) {
        // Устанавливаем заголовок окна
        setTitle("Отображение изображения");

        // Создаем метку для отображения изображения
        imageLabel = new JLabel();
        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);

        // Загружаем и отображаем изображение
        displayImage(imagePath);

        // Устанавливаем размер окна
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void displayImage(String imagePath) {
        try {
            // Загружаем изображение из файла
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Отображаем изображение в метке
            ImageIcon icon = new ImageIcon(image);
            imageLabel.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось загрузить изображение.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, верно укажите путь к изображению в аргументах командной строки.");
            System.exit(1);
        }

        ImageDisplay a = new ImageDisplay(args[0]);
    }
}

