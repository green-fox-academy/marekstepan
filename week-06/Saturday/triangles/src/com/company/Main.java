package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

/*
//draw trngl by lines
    public static void mainDraw(Graphics graphics) {
        drawTriangle(graphics, HEIGHT/2, WIDTH/2,0, 0);
    }


    //Recursive method
    public static void drawTriangle(Graphics graphics, int height, int topX, int topY,  int level){
        //Base case
        if (level > 6){
            return;
        }

        int rightX = (int) Math.round((topX + height * Math.tan(Math.toRadians(30))));
        int rightY = height + topY;

        int leftX = (int) Math.round((topX - height * Math.tan(Math.toRadians(30))));
        int leftY = height + topY;

        //Drawing main triangle
        graphics.drawLine(topX, topY, rightX, rightY);
        graphics.drawLine(rightX, rightY, leftX, leftY);
        graphics.drawLine(leftX, leftY, topX, topY);

        //Apply recursion
        drawTriangle(graphics, height/2, rightX, topY, level + 1);
        drawTriangle(graphics, height/2, topX, height + topY, level + 1);
        drawTriangle(graphics, height/2, leftX, topY, level + 1);

    }

 */

//draw trngls by drawPolygon
public static void mainDraw(Graphics graphics) {
    drawTriangle(graphics, HEIGHT/2, WIDTH/2,
        0, 0);
}


    //Recursive method
    public static void drawTriangle(Graphics graphics, int height, int topX, int topY,  int level){
        //Base case
        if (level > 6){
            return;
        }

        int rightX = (int) Math.round((topX + height * Math.tan(Math.toRadians(30))));
        int rightY = height + topY;

        int leftX = (int) Math.round((topX - height * Math.tan(Math.toRadians(30))));
        int leftY = height + topY;

        int[] xs = {topX, rightX, leftX};
        int[] ys = {topY, rightY, leftY};

        //Drawing main triangle
        graphics.drawPolygon(xs, ys, 3);

        //Apply recursion
        drawTriangle(graphics, height/2, rightX, topY, level + 1);
        drawTriangle(graphics, height/2, topX, height + topY, level + 1);
        drawTriangle(graphics, height/2, leftX, topY, level + 1);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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