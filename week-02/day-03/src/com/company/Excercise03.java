package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise03 {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0,0,343,343);

        graphics.setColor(Color.RED);
        graphics.drawLine(320,0,0,343);
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.



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
