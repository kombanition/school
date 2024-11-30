/*
    Aufgabe 2) Erste Methoden
*/
public class Aufgabe2 {

    private static void printNumCharsInString(String text, int startIndex, int numChar ) {
        // check if given arguments are valid
        assert (text != null) && (text.length() > 0) && (startIndex >= 0) && (text.length() > startIndex)
                && (numChar >= 0) : "please enter valid input";
        // printing the output
        for (int i = startIndex; i < numChar + startIndex; i++) {
            System.out.print(text.charAt(i % text.length()));
        }
    }
    private static void printNumbersInInterval(int start, int end) {
        assert end > start : "end must be greater than start";
        for(int i = end; i >= start; i--) {
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isCharNTimesInString(String text, char character, int nTimes){
        assert (nTimes >= 0) && text.length() > 0 : "please enter valid input";
        int counter = 0;
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == character){
                counter++;
            }
        }
        return counter == nTimes;
    }
    private static String changeLettersInString(String text) {
        String outputString = "";
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) > 97 && text.charAt(i) <= 122) || (text.charAt(i) > 65 && text.charAt(i) <= 90)) {
                outputString += (char) (text.charAt(i) - 1);
            } else {outputString += (char) (text.charAt(i));}
        }
        return outputString;
    }

    public static void main(String[] args) {
        assert (isCharNTimesInString("nennenswerte Worte", 'n', 4));
        assert (!isCharNTimesInString("nennenswerte Worte", 'n', 3));
        assert (!isCharNTimesInString("nennenswerte Worte", 'e', 6));
        assert (isCharNTimesInString("Test", 'x', 0));

        assert (changeLettersInString("Hello World!").equals("Gdkkn Vnqkc!"));
        assert (changeLettersInString("Anfang und Ende.").equals("Ameamf tmc Dmcd."));
        assert (changeLettersInString("+ABC_123_DEF#").equals("+AAB_123_CDE#"));
        assert (changeLettersInString("ABCDYZ_abcdyz").equals("AABCXY_aabcxy"));

        //TODO: Testen Sie hier zusätzlich alle Methoden mit verschiedenen Inputs!

        assert (changeLettersInString("aaaaAAAAbbbbBBBB").equals("aaaaAAAAaaaaAAAA"));
        assert (changeLettersInString("aaaaAAAA").equals("aaaaAAAA"));
        System.out.println("Assertions completed successfully \nAdditional Tests:");
        printNumCharsInString(":-) ", 0, 40); // should print smiley 10 times
        System.out.println();
        printNumCharsInString("Name ist Nik. Hallo, mein ", 14, 26); /* should
        print a grammatically correct sentence */
        System.out.println();
        printNumbersInInterval(0, 99); // should print all multiples of 3 that are < 100 & >= 0.
    }
}
