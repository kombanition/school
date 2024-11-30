/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    private static void addChar(String text, char character) {
        assert text != null : "enter a non empty string"; // check that string is not null
        int count = 0;
        String c = String.valueOf(character); // convert to string
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            if(i == text.length() - 1) break; // break after last character is printed

            if (count % 2 == 0) System.out.print(c.repeat(2));
            else System.out.print(c);
            count++;
        }
    }
    private static void addChar(int number, char character) {
        assert number > 0 : "enter a number greater than 0";
        String num = String.valueOf(number);
        addChar(num, character);
    }
    private static void addChar(String text, String characters) {
        assert text != null && characters != null : "enter non empty strings";
        for(int i = 0; i < characters.length(); i++) {
            addChar(text, characters.charAt(i));
            System.out.println();
        }
    }
    private static void addChar(String text) {
        assert text != null : "enter a non empty string";
        addChar(text, '=');
    }

    public static void main(String[] args) {
        String text0 = "";
        String text1 = "A";
        String text2 = "CW";
        String text3 = "EP1";
        String text4 = "Index";

        addChar(text0, '&');
        addChar(text1, '+');
        addChar(text2, '*');
        addChar(text3, '-');
        addChar(text4, '#');

        addChar(1, '.');
        addChar(42, ':');
        addChar(148, '$');
        addChar(2048, ')');
        addChar(131719, '%');

        addChar(text2, "!O(");
        addChar(text4, "T1#+");

        addChar(text1);
        addChar(text2);
        addChar(text3);
    }
}
