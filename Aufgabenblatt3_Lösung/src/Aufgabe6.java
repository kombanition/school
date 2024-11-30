/*
    Aufgabe 6) Kreise => Rekursiv
*/

import codedraw.*;

import java.awt.*;

public class Aufgabe6 {

    private static void drawCirclesRec(CodeDraw cd, int y, int radius, int num) {
        if(num <= 0){
            return;
        }
        cd.setColor(new Color(255 - num * 30, 255 - num * 30, 0));
        cd.fillCircle(256, y, radius);
        drawCirclesRec(cd, y - radius/2, radius/2, num - 1);
        drawCirclesRec(cd, y + radius/2, radius/2, num - 1);
    }

    public static void main(String[] args) {
        int pixelWidth = 512;
        int pixelHeight = 512;
        CodeDraw cd = new CodeDraw(pixelWidth, pixelHeight);
        drawCirclesRec(cd, pixelHeight / 2, pixelWidth / 2, 5);
        cd.show();
    }
}



