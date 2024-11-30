/*
    Aufgabe 3) Rekursion
*/
public class Aufgabe3 {

    private static void printOddNumbersAscending(int start, int end) {
        if (start >= end) return; // Methode funktioniert nicht, wenn end größer als start ist.
        if (start % 2 == 1){
            System.out.print(start + " ");
            printOddNumbersAscending(start + 2, end);
        } else printOddNumbersAscending(start + 1, end);
    }
    private static void printEvenNumbersDescending(int end) {
        if (end < 0) return;
        if (end % 2 == 0){
            System.out.print(end + " ");
            printEvenNumbersDescending(end - 2);
        } else printEvenNumbersDescending(end - 1);
    }
    private static int countCharChanges(String text) {
        int charChanges = 0;

        if(text.length() > 1){
            if (text.charAt(0) != text.charAt(1)){
                charChanges++;
            }
            charChanges += countCharChanges(text.substring(1));
        }
        return charChanges;
    }

    public static void main(String[] args) {

        printOddNumbersAscending(5, 14);
        printEvenNumbersDescending(11);
        System.out.println(countCharChanges("A"));
        System.out.println(countCharChanges("AA"));
        System.out.println(countCharChanges("abBc"));
        System.out.println(countCharChanges("XYYYZZAAAB"));
        System.out.println(countCharChanges("satt"));
        System.out.println(countCharChanges("Schifffahrt"));
        System.out.println();

        assert (countCharChanges("A") == 0);
        assert (countCharChanges("AA") == 0);
		assert (countCharChanges("abBc") == 3);
        assert (countCharChanges("XYYYZZAAAB") == 4);
        assert (countCharChanges("satt") == 2);
        assert (countCharChanges("Schifffahrt") == 8);
    }
}

