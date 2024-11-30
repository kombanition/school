/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void printArray(int[] workArray) {
        for (int i = workArray.length; i > 0; i--) {
            System.out.print(workArray[i-1] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] filledArray) {
        int number = 3;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = number;
            number += 3;
        }
    }

    private static void printContentFilteredArray(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 9 == 0) {
                copiedArray[i] = -1;
            }
        }
        printArray(copiedArray);
    }

    private static void fillArrayWithNewContent(int[] workArray) {
        int[] helpArray = new int[15];
        int number = 4;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = number;
            number += 4;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        fillArray(filledArray);
        printArray(filledArray);

        printContentFilteredArray(filledArray);
        printArray(filledArray);
        System.out.println();
        filledArray[0] = 123;
        printArray(filledArray);

        fillArrayWithNewContent(filledArray);
        printArray(filledArray);


    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Antwort zu Punkt a:
    /*Weil i einmal zu -1 wird. Das kann gefixed werden, in dem die Schleifenbedingung von i >= 0
    zu i > 0 geändert wird.*/
    //Antwort zu Punkt b:
    //Weil der Methode die Referenz zum Array übergeben wird und nicht eine Kopie des Arrays.
    //Antwort zu Punkt c:
    //Weil die beiden Arrays dieselbe Referenz haben. (In der ersten Zeile der Methode passiert das)
    //Antwort zu Punkt d:
    //Weil die Methode nur eine Kopie der Referenz bekommt und wenn sie diese Kopie verändert hat das
    //keinen Einfluss auf die ursprüngliche Referenz.

    /*
    Zusatzfragen:
    1) Intager. (Char, byte und short würden auch gehen)
    2) In dem man einen neuen Array mit der gewünschten Länge erstellt und die alten Inhalte reinkopiert.
    3) Entweder mit arraycopy oder mit clone, oder mit einer Schleife.
    4) Das ist eher nicht sinnvoll, weil dabei nur die Referenzen und nicht die Inhalte der Arrays verglichen
       werden. == könnte zum Beispiel false liefern, obwohl 2 arrays genau die selben Elemente beinhalten.
       Wenn er true liefert, enthalten die beiden Arrays aber dieselben Elemente, da sie den selben Speicherort
       haben.
     */
}
