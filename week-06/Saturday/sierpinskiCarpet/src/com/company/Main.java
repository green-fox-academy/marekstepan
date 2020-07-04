package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {
        sierpinski(graphics, WIDTH / 3, WIDTH / 2, HEIGHT / 2, 0);
    }

    public static void sierpinski(Graphics graphics, int size, int centerX, int centerY,
                                  int level) {
        //Base case
        if (level > 6) {
            return;
        }
        int x = centerX - (int) Math.round(size / 2);
        int y = centerY - (int) Math.round(size / 2);

        //Drawing main triangle
        graphics.fillRect(x, y, size, size);

        //Apply recursion

        sierpinski(graphics, (int) Math.round(size / 3), x - (int) Math.round(size / 2),
            y - (int) Math.round(size / 2),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x + (int) Math.round(1.5 * size),
            y - (int) Math.round(size / 2),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x + (int) Math.round(1.5 * size),
            y + (int) Math.round(1.5 * size),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x - (int) Math.round(size / 2),
            y + (int) Math.round(1.5 * size),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x + (int) Math.round(size / 2),
            y - (int) Math.round(size / 2),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x - (int) Math.round(size / 2),
            y + (int) Math.round(size / 2),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x + (int) Math.round(1.5 * size),
            y + (int) Math.round(size / 2),
            level + 1);
        sierpinski(graphics, (int) Math.round(size / 3), x + (int) Math.round(size / 2),
            y + (int) Math.round(1.5 * size),
            level + 1);

    }

    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

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