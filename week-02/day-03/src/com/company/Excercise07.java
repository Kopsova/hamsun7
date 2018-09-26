package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise07 {

    public static void mainDraw(Graphics graphics){

        rectangle(graphics,10,10,10,50);
        // draw four different size and color rectangles.
        // avoid code duplication.

    }


    public static void rectangle(Graphics graphics, int x, int y, int width, int height) {

        for (int i = 0; i <= 80; i+=20) {

            Random rndColor = new Random();
            graphics.setColor(new Color(rndColor.nextInt(256), rndColor.nextInt(256), rndColor.nextInt(256)));

            graphics.fillRect(rndColor.nextInt(100),rndColor.nextInt(300),width+i, height);


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
