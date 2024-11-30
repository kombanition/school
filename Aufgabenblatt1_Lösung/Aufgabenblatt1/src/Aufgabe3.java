/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/



public class Aufgabe3 {
    public static void main(String[] args) {
        double dt = 1;
        double maxCap = 1500;
        double numFoxes = 2; // Start-Population
        double numRabbits = 2500;
        double maxRabbits = 2500; // Maximale Population (Deklarierung nach Angabe)
        double maxFoxes = 200;

        for(int i = 1; i <= 500; i++){
            // Berechnung der relevanten Werte nach Angabe für jede Iteration
            double numContacts = numFoxes * numRabbits;
            double decFoxes = 0.2 * numFoxes;
            double freeCap = maxCap - numRabbits;
            double incRabbits = 0.08 * freeCap/maxCap * numRabbits;
            numRabbits = numRabbits + dt * (incRabbits - 0.002 * numContacts);
            numFoxes = numFoxes + dt * (0.0004 * numContacts - decFoxes);

            // Ausgabe der Zahlenwerte für jede Iteration
            System.out.println("Iteration " + i + ": ");
            System.out.format("freeCap: %.2f", freeCap);
            System.out.format(" rabbit population: %.2f",numRabbits);
            System.out.format(" fox population: %.2f \n",numFoxes);

            // Berechnung der Anzahl der Symbole mit denen die Populationen repräsentiert werden
            double maxWidth = 100; /* Maximale Balkenlänge in der Console, ich habe mich für 100
                                      entschieden, weil 500 nicht in meine Console gepasst hat */
            int scaledNumRabbits = (int) Math.round(numRabbits * (maxWidth / maxRabbits));
            int scaledNumFoxes = (int) Math.round(numFoxes * (maxWidth / maxFoxes));

            // Ausgabe der Balken
            for(int j = 0; j <= Math.round(scaledNumRabbits); j++){
                System.out.print("*");
            }
            System.out.println();
            for(int j = 0; j <= Math.round(scaledNumFoxes); j++){
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }
}
