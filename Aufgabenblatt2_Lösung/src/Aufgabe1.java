/*
    Aufgabe 1) Verschachtelte Schleifen - Optische Täuschung
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe1 {

    public static void main(String[] args) {
        int ws = 400;
        CodeDraw cd = new CodeDraw(ws, ws);

        double r = (double) 1/60 * ws; // radius
        double circlesPerLine = Math.round(ws / (4 * r)); // rounding just to be sure
        double middleSquareLength = 0.5 * ws - 2 * r; // side length of the square in the middle of the window
        double squaresPerLine = Math.round(middleSquareLength / (4 * r)); // number of small squares

        // drawing of circles and squares
        for(int i = 0; i < circlesPerLine; i++) {
            for(int j = 0; j < circlesPerLine; j++) {
                cd.setColor(Palette.BLACK);
                // checking if the indexes are within the boundaries of the middle square
                if(((i >= (circlesPerLine - squaresPerLine) / 2) && (i < (circlesPerLine + squaresPerLine) / 2))
                && ((j >= (circlesPerLine - squaresPerLine)/2) && (j < (circlesPerLine + squaresPerLine)/2))) {
                    // drawing square if yes
                    cd.setLineWidth(1);
                    cd.drawSquare(r + (j * 4 * r),r + (4 * r * i), 2 * r);
                } else {
                    // drawing the black circles
                    cd.fillCircle((2 * r) + (j * 4 * r), (2 * r) + (4 * r * i), r);
                    cd.setColor(Palette.GRAY); // setting the conditions for the gray circles
                    cd.setLineWidth(3);
                    cd.drawCircle((2 * r) + (j * 4 * r), (2 * r) + (4 * r * i), r);
                }
            }
        }
        // setting the conditions for drawing the big middle square
        cd.setLineWidth(1);
        cd.setColor(Palette.BLACK);
        cd.drawRectangle(0.25 * ws + r,0.25 * ws + r, middleSquareLength, middleSquareLength);
        cd.show(); // show the result
    }
}
