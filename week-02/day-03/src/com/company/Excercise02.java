package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise02 {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.GREEN);
        graphics.drawLine(25, 25, 150, 25);

        graphics.setColor(Color.RED);
        graphics.drawLine(25, 25, 25, 150);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(150, 25, 150, 150);

        graphics.setColor(Color.YELLOW);
        graphics.drawLine(25, 150, 150, 150);
        // Draw a box that has different colored lines on each edge.


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
