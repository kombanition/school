/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        /*
        Aufgabe a)

        // String text = "Anzahl der Zeichen ist nicht genug!";
        String text = "Eine nennenswerte und geeignete Sprache.";
        String lowerCaseText = text.toLowerCase();

        int i = 0;
        while(i < lowerCaseText.length()) {
            if (lowerCaseText.charAt(i) == 'a' || lowerCaseText.charAt(i) == 'e' ||
                    lowerCaseText.charAt(i) == 'i' || lowerCaseText.charAt(i) == 'o' ||
                    lowerCaseText.charAt(i) == 'u') {
                System.out.print("-" + text.charAt(i));
            } else {
                System.out.print(text.charAt(i));
            }
            i++;
        }
         */

        /*
        Aufgabe b)

        String text = "Eine nennenswerte und geeignete Sprache.";
        // String text = "Anzahl der Zeichen ist nicht genug!";

        int i = 0;

        while (i < text.length()) {
            char letter = text.charAt(i);

            if (!(97 <= (int) letter && (int) letter <= 106) &&
                    !((65 <= (int) letter) && ((int) letter <= 74)) &&
                    (int) letter != 32) {
                System.out.print(letter);
            }
            i++;
        }
         */

        /*
        Aufgabe c)

        int i = 35;

        while(i < 175){
            if((i % 5 == 0) && (i % 7 == 0)){
                System.out.print(i + " ");
            }
            i++;
        }
         */

    }
}






