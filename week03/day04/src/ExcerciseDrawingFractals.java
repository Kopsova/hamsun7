import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class ExcerciseDrawingFractals {

    public static void mainDraw(Graphics graphics) {
        xoField(graphics, 0, 0, WIDTH);

    }


    public static void xoField(Graphics graphics, int x, int y, int size) {
        graphics.drawLine(x + size / 3, y, x + size / 3, size + y);
        graphics.drawLine(2 * size / 3 + x, y, 2 * size / 3 + x, size + y);
        graphics.drawLine(x, size / 3 + y, size + x, size / 3 + y);
        graphics.drawLine(x, 2 * size / 3 + y, size + x, 2 * size / 3 + y);
        if (size > 0) {
            xoField(graphics, x + size / 3, y, size / 3);
            xoField(graphics, x + size / 3, 2 * size / 3 + y, size / 3);
            xoField(graphics, x, size / 3 + y, size / 3);
            xoField(graphics, 2 * size / 3 + x, size / 3 + y, size / 3);
        }

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


