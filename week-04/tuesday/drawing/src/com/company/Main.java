package com.company;

import java.util.Random;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;


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

        /*
        for (int i = 0; i < 4; i++) {
            lineToCenter(i*20, (160 - i*30), graphics);
        }
    }

    public static void lineToCenter(int x, int y, Graphics graphics) {
         graphics.setColor(Color.blue);
         graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
    }
     */

/*
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.
        for (int i = 10; i < 260; i+=5) {
            horizontalLines(i, i, graphics);
        }
    }

    public static void horizontalLines(int x, int y, Graphics graphics) {
        graphics.setColor(Color.green);
        graphics.drawLine(x, y, x+50, y);
    }
 */

/*
    // Draw a green 10x10 square to the canvas' center.
        int x = WIDTH/2 - 5;
        int y = HEIGHT/2 - 5;
        int dim1 = 10;
        int dim2 = dim1;
        squareCentered(x, y, dim1, dim2, graphics);
    }

    public static void squareCentered(int x, int y, int dim1, int dim2, Graphics graphics) {
        graphics.setColor(Color.orange);
        graphics.drawRect(x, y, dim1, dim2);
    }
*/

        // draw four different size and color rectangles.
        // avoid code duplication.
/*
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            skver(x, y, graphics);
        }
    }

    public static void skver(int x, int y, Graphics graphics) {
        Random random = new Random();
        int dim1 = random.nextInt(60);
        int dim2 = dim1;

        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color myRandomColor = new Color(red, green, blue);
        graphics.setColor(myRandomColor);
        graphics.drawRect(x, y, dim1, dim2);
    }
*/

/*
    // create a function that draws one square and takes 3 parameters:
    // the x and y coordinates of the square's top left corner and the graphics
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int x = 25;
            int y = 25;
            skver(x, y, graphics);
        }
    }

    public static void skver(int x, int y, Graphics graphics) {
        Random random = new Random();
        int dim1 = random.nextInt(200);
        int dim2 = dim1;
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color myRandomColor = new Color(red, green, blue);
        graphics.setColor(myRandomColor);
        graphics.drawRect(x, y, dim1, dim2);
    }
 */

        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
/*
        for (int i = 0; i < 3; i++) {
            skver(graphics);
        }
    }

    public static void skver(Graphics graphics) {
    // ok ok it takes only graphics, cause i am giving it the size of the square randomly
    // it is easy to tweak it

        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        int dim1 = random.nextInt(200);
        int dim2 = dim1;
        int x = WIDTH/2 - dim1/2;
        int y = x;
        Color myRandomColor = new Color(red, green, blue);
        graphics.setColor(myRandomColor);
        graphics.drawRect(x, y, dim1, dim2);
    }
*/

/*
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        int size = 100;
        Color color = Color.black;
        Color indigo = new Color(75, 0, 130);
        Color violet = new Color(139, 0, 255);
        Color [] rainbow = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, indigo, violet};

        for (int i = 0; i < 7; i++) {
            graphics.setColor(rainbow[i]);
            graphics.fillRect((0 + i*((WIDTH/2 - size/2) / 7)), (0 + i*((HEIGHT/2 - size/2) / 7)),
            (WIDTH - i * ((WIDTH - size)/7)), (HEIGHT - i * ((HEIGHT - size)/7)));
        }
        skver(size, color, graphics);
    }

    public static void skver(int size, Color color, Graphics graphics) {
        int x = WIDTH/2 - size/2;
        int y = HEIGHT/2 - size/2;
        graphics.setColor(color);
        graphics.fillRect(x, y, size, size);
    }

*/

/*
    //TRIANGLES drawing exercise
        // you can select the number of triangels in the first floor and the length of their side :)
        int tBaseCount = 20;
        int tBaseLength = 10;
        float increment = (float) (Math.sqrt(3) / 2 * tBaseLength);
        graphics.setColor(Color.blue);
        for (int i = 0; i < tBaseCount; i++) {
            graphics.drawLine(Math.round(0 + i*tBaseLength/2), Math.round(tBaseCount * increment - i*increment),
                Math.round(tBaseCount*tBaseLength - i*tBaseLength/2), Math.round(tBaseCount * increment - i*increment));
        }
        for (int i = 0; i < tBaseCount; i++) {
            graphics.drawLine(0 + i*tBaseLength, Math.round(tBaseCount * increment),
                Math.round(tBaseCount*tBaseLength/2 + i*tBaseLength/2), Math.round(0 + i*increment));
        }
        for (int i = 0; i < tBaseCount; i++) {
            graphics.drawLine(Math.round(tBaseCount*tBaseLength/2 - i*tBaseLength/2), Math.round(0 + i*increment),
                Math.round(tBaseCount*tBaseLength - i*tBaseLength), Math.round(tBaseCount*increment));
        }

    }
*/

/*
    //ENVELOPE STAR drawing exercise
    // tBaseCount == number of lines that u like to have in 1 quadrant not counting the central vertical irregular one
    int tBaseCount = 20;
    float incrementHor = (float) (WIDTH / 2 / tBaseCount);
    float incrementVer = (float) (HEIGHT / 2 / tBaseCount);
    graphics.setColor(Color.blue);
    for (int i = 0; i < tBaseCount; i++) {
        graphics.drawLine(Math.round(0 + i*incrementHor), HEIGHT/2, WIDTH/2,
            Math.round(tBaseCount*incrementVer - (i+1)*incrementVer));
    }
    for (int i = 0; i < tBaseCount; i++) {
        graphics.drawLine(WIDTH/2, Math.round(0 + i*incrementVer), Math.round(WIDTH/2 + (i+1)*incrementHor),
            HEIGHT/2);
        }

    for (int i = 0; i < tBaseCount; i++) {
        graphics.drawLine(Math.round(0 + i*incrementHor), HEIGHT/2,
            WIDTH/2, Math.round(HEIGHT/2 + (i+1)*incrementVer));
    }

    for (int i = 0; i < tBaseCount; i++) {
        graphics.drawLine(WIDTH/2, Math.round(HEIGHT/2 + (i+1)*incrementVer),
            Math.round(WIDTH - i*incrementHor), HEIGHT/2);
    }
    graphics.drawLine(WIDTH/2,0,WIDTH/2, HEIGHT);
}
// of course I can make and use a function for this but I am already mentally in hexagons
*/


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
