/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in 1-2 Sätzen was der Spaghetticode macht
    //
    // Das Programm gibt auf der Konsole ein Muster aus, das in der Mitte eine große Raute enthält.

    //TODO zu Punkt b): Beschreiben Sie in 1-2 Sätzen was Sie ändern würden und warum
    //
    // Das Programm ist sehr unleserlich und nicht flexibel, ich würde versuchen alles
    // in zwei verschachtelten For-Schleifen zu lösen und je nach dem Index entscheiden,
    // welches Symbol gezeichnet werden soll. Somit könnte man dann auch durch Änderung von
    // ein paar Werten die Größe oder die Art der Symbole etc. einfacher ändern.

    final static int patternWidth = 100; /* Deklarierung der Breite des Musters außerhalb einer Methode.
    ich habe es so gemacht, weil ich mir dachte, das ist effizienter als zweimal den selben Wert als
     Parameter zu liefern. Die Breite muss ein gerader Wert sein. */

    private static void printBoundaryLine(){
        for(int i=0; i < patternWidth; i++){
            if(i == 0 || i == patternWidth-1){
                System.out.print("#");
            } else{
                System.out.print("+");
            }
        }
        System.out.println();
    }

    private static void printDiamond(){
        int count = 0; // Count wird deklariert um die Postionen der Schrägstriche zu berechnen.
        int half = (patternWidth - 2) / 2; // Die Position der Hälfte ohne die #.

        for(int i=0; i < patternWidth - 2; i++){
            // Am Anfang soll der count 0 sein, deswegen die verschachtelte Verzweigung. Wenn i gleich der Hälfte ist
            // soll sich count nicht verändern, damit zweimal die selben Positionen für die Schrägstriche berechnet werden.
            // Danach soll der count wieder abnehmen.
            if(i != 0){
                if(i < half) count += 1;
                else if (i > half) count -= 1;
            }
            for(int j=0; j < patternWidth; j++){
                if(j == 0 || j == patternWidth-1) System.out.print("#");
                else if(j == half - count) System.out.print(i < half ? "/" : "\\");
                else if(j == half + count + 1) System.out.print(i < half ? "\\" : "/");
                else System.out.print(".");
            }
            System.out.println();
            }
        }

    public static void main(String args[]) {
        //TODO zu Punkt c,d und e): Implementieren Sie hier Ihre Lösung für die Angabe
        System.out.println("Ihre Ausgabe:");
        printBoundaryLine();
        printDiamond();
        printBoundaryLine();
    }
}


