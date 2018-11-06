import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Excercise01SquareGrid {
    public static void mainDraw(Graphics graphics) {
        whiteOnBlack(graphics, 0, 0, WIDTH);

    }

    public static void whiteOnBlack(Graphics graphics, int x, int y, int size) {

        graphics.fillRect(x + size / 4, y + size / 4, size / 2, size / 2);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + size / 4 + size / 50, y + size / 4 + size / 50, size / 2 - size / 25, size / 2 - size / 2);
        if (size > 0) {
            whiteOnBlack(graphics, x + size / 8, y + size / 8, size / 4);

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


