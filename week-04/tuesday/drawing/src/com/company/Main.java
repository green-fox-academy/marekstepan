package com.company;

import java.util.Random;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        /*
        graphics.setColor(Color.RED);
        graphics.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
        */

        /*
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.RED);
        graphics.drawLine(50, 50, 200, 50);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(50, 50, 50, 200);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(200, 50, 200, 200);
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(50, 200, 200, 200);
        */

        /*
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH, 0, 0, HEIGHT);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, 0, WIDTH, HEIGHT);
        */

        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        

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
