package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise02 {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < 160; i += 15) {
            graphics.drawLine(160, i, 160 + i, 160);
            graphics.drawLine(160, 320 - i, 160 - i, 160);
            graphics.drawLine(160, i, 160 - i, 160);
            graphics.drawLine(160 + i, 160, 160, 320 - i);


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
