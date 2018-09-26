package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise10 {
    public static void mainDraw(Graphics graphics) {
        rainbowSquare(graphics,150, 56);
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
    }

    public static void rainbowSquare( Graphics graphics, int size, int colorNumb ) {
        for (int i = size ; i > 0; i-= 10) {

            Random rndColor = new Random();
            graphics.setColor(new Color(rndColor.nextInt(colorNumb), rndColor.nextInt(colorNumb), rndColor.nextInt(colorNumb)));

            graphics.fillRect(WIDTH/2- size/2- i/2, HEIGHT/2- size/2-i/2, size+i, size+i);



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
