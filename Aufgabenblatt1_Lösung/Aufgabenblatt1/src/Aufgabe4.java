/*
    Aufgabe 4) CodeDraw Bibliothek und Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe4 {

    public static void main(String[] args) {

        // a)
        int pixelWidth = 500;
        int pixelHeight = 500;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);

        int numLinesQuadrant = 50;

        myDrawObj.setCanvasPositionX(600);
        myDrawObj.setCanvasPositionX(100);

        for (int i = 1; i <= numLinesQuadrant; i++) {
            //CYAN quadrant (top left)
            myDrawObj.setColor(Palette.CYAN);
            myDrawObj.drawLine(i * (pixelWidth / 2.0 / numLinesQuadrant), 0, 0, pixelHeight / 2.0 - ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
        }
        for (int i = 1; i <= numLinesQuadrant; i++) {
            //GREEN quadrant (top right)
            myDrawObj.setColor(Palette.GREEN);
            myDrawObj.drawLine(pixelWidth - i * (pixelWidth / 2.0 / numLinesQuadrant), 0, pixelWidth, pixelHeight / 2.0 - ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
        }

        for (int i = 1; i <= numLinesQuadrant; i++) {
            //MAGENTA quadrant (bottom left)
            myDrawObj.setColor(Palette.MAGENTA);
            myDrawObj.drawLine(i * (pixelWidth / 2.0 / numLinesQuadrant), pixelHeight, 0, pixelHeight / 2.0 + ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
        }
        for (int i = 1; i <= numLinesQuadrant; i++) {
            //ORANGE quadrant (bottom right)
            myDrawObj.setColor(Palette.ORANGE);
            myDrawObj.drawLine(pixelWidth - i * (pixelWidth / 2.0 / numLinesQuadrant), pixelHeight, pixelWidth, pixelHeight / 2.0 + ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
        }

        myDrawObj.setLineWidth(2);
        myDrawObj.setColor(Palette.BLACK);
        myDrawObj.drawLine(pixelWidth / 2.0, 0, pixelWidth / 2.0, pixelHeight);//vertical line
        myDrawObj.drawLine(0, pixelHeight / 2.0, pixelWidth, pixelHeight / 2.0);//horizontal line

        myDrawObj.show();
    }
}
