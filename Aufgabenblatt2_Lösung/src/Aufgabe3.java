/*
    Aufgabe 3) Schleifen und Methoden - Harshad-Zahlen
*/
public class Aufgabe3 {

    private static boolean isHarshadNumber(int number) {
        assert number > 0: "enter a number greater than zero";
        int sumOfDigits = 0;
        int ogNumber = number; // saving the input value of "number"
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return ogNumber % sumOfDigits == 0;
    }
    private static void printHarshadNumbersInInterval(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(isHarshadNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("1 --> " + isHarshadNumber(1));
        assert (isHarshadNumber(1));
        System.out.println("4 --> " + isHarshadNumber(4));
        assert (isHarshadNumber(4));
        System.out.println("13 --> " + isHarshadNumber(13));
        assert (!isHarshadNumber(13));
        System.out.println("97 --> " + isHarshadNumber(97));
        assert (!isHarshadNumber(97));
        System.out.println("777 --> " + isHarshadNumber(777));
        assert (isHarshadNumber(777));
        System.out.println("8316 --> " + isHarshadNumber(8316));
        assert (isHarshadNumber(8316));
        System.out.println("9214 --> " + isHarshadNumber(9214));
        assert (!isHarshadNumber(9214));
        System.out.println("172986 --> " + isHarshadNumber(172986));
        assert (isHarshadNumber(172986));
        System.out.println("!test successful!");

        //TODO: Testen Sie hier alle Methoden mit verschiedenen Inputs!

        // assert (isHarshadNumber(-10)); // returns error
        assert (isHarshadNumber(21));
        System.out.println("21 --> " + isHarshadNumber(21));
        assert (!isHarshadNumber(22));
        System.out.println("22 --> " + isHarshadNumber(22));
        assert (!isHarshadNumber(23));
        System.out.println("23 --> " + isHarshadNumber(23));
        assert (isHarshadNumber(24));
        System.out.println("24 --> " + isHarshadNumber(24));
        assert (isHarshadNumber(220000000));
        System.out.println("220000000 --> " + isHarshadNumber(220000000));
        // assert (isHarshadNumber("test"));
        assert(isHarshadNumber('p')); // ASCII-value: 112
        System.out.println("p --> " + isHarshadNumber('p'));
    }
}
