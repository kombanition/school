/*
    Aufgabe 4) Password - Entropieberechnung
*/

import java.util.Random;

public class Aufgabe4 {

    private static double calculateEntropy(String password) {
        /*
        Checking if password contains certain symbols. Initially I would have solved this by declaring
        characterSet outside of main() in the class, checking that there are no repeating symbols and
        using the length of characterSet instead of possibleChars. I think that would have been better,
        because this algorithm assumes that for example the password "1a1a" with the characterSet "1a"
        has 36 different possible symbols when it is only 2.
         */
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        int possibleChars = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }
        if (hasDigit){
            possibleChars += 10;
        } else if (hasLower){
            possibleChars += 26;
        } else if (hasUpper){
            possibleChars += 26;
        }

        double entropy = password.length() * (Math.log10(possibleChars) / (Math.log10(2)));
        return entropy;
    }

    public static void main(String[] args) {
        int passwordLength = 10;
        String characterSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int seed = 0;
        Random myRand = new Random(seed);
        // generating password and using method to calculate entropy
        String password = "";
        for(int i = 0; i < passwordLength; i++){
            password += characterSet.charAt(myRand.nextInt(characterSet.length()));
        }
        double entropy = calculateEntropy(password);

        // determining password strength
        String passwordStrength;
        if (entropy < 60) {
            passwordStrength = "weak";
        } else if (entropy < 120){
            passwordStrength = "strong";
        } else passwordStrength = "very strong";

        // printing the final output
        System.out.println("The generated password is " + password);
        System.out.println("Entropy of the password: " + entropy + " -> the password is: " + passwordStrength);
    }
}

