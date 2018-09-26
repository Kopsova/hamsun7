package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Excercise08 {

    public static void mainDraw(Graphics graphics){
        square(graphics,0,0,50,50);
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.


    }

    public static void square (Graphics graphics, int x, int y, int width, int height) {
        for (int i = 0; i < 150 ; i+=50) {
            graphics.drawRect(0+i,0+i,50,50);

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
