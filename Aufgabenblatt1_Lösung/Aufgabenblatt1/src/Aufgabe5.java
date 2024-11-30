import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe5 {

    public static void main(String[] args) {
        int pixelWidth = 300;
        int pixelHeight = 300;
        CodeDraw cd = new CodeDraw(pixelWidth, pixelHeight);

        int squaresPerLength = 19;
        int squaresPerHalf = squaresPerLength / 2; // Deklariert um die Lesbarkeit zu verbessern
        double sideLength = (double) pixelWidth / squaresPerLength; // Als double deklariert nach Angabe

        // Obere Reihe
        for(int i = 0; i < squaresPerLength - 1; i++) {
            cd.setColor(Palette.RED);
            cd.drawSquare(i * sideLength,0,sideLength);
        }
        // Diagonale
        for(int i = 0; i < squaresPerLength / 2; i++) {
            cd.setColor(Palette.BLUE);
            cd.drawSquare((squaresPerLength - i - 1) * sideLength, i * sideLength , sideLength);
            }
        // Vertikale
        for(int i = squaresPerHalf; i < squaresPerLength; i++) {
            cd.setColor(Palette.RED);
            cd.drawSquare(squaresPerHalf * sideLength,i * sideLength , sideLength);
        }
        // Untere Reihe
        for(int i = squaresPerHalf; i < squaresPerLength; i++) {
            cd.setColor(Palette.RED);
            if(i == squaresPerLength - 1){
                cd.setColor(Palette.BLUE);
            }
            cd.drawSquare((squaresPerLength - i - 1) * sideLength, (squaresPerLength - 1) * (sideLength), sideLength);
        }
        cd.show();
    }
}
