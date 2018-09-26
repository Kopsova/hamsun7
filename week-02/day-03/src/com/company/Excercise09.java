package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise09 {

    public static void mainDraw(Graphics graphics){

        squarre(graphics, 10);
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

    }

    public static void squarre (Graphics graphics, int size) {
        for (int i = 0; i < 30 ; i+=10) {
            graphics.drawRect(WIDTH/2-size/2 -i/2, HEIGHT/2- size/2- i/2, size+i, size+i);

        }
    }





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
