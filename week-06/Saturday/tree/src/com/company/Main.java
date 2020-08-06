package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {
        tree(graphics, -90, 400, 780, 12);
    }


    //Recursive method
    public static void tree(Graphics graphics, int branchAngle, int baseX,
                            int baseY,  int level){
        //Base case
        if (level == 0){
            return;
        }

        int nodeX = (int) (baseX + Math.cos(Math.toRadians(branchAngle)*9*level));
        int nodeY = (int) (baseY + Math.sin(Math.toRadians(branchAngle)*9*level));

        graphics.drawLine(baseX, baseY, nodeX, nodeY);

        tree(graphics, branchAngle + 10, nodeX,
            nodeY, level -1);
        tree(graphics, branchAngle - 10, nodeX,
            nodeY, level -1);

    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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
