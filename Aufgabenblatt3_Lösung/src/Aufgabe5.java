/*
    Aufgabe 5) Rekursion
*/
public class Aufgabe5 {

    private static String orderCharGroups(String text) {
        if(text.length() < 2) return text;
        char first = text.charAt(0);
        String orderedRest = orderCharGroups(text.substring(1));

        if(first <= orderedRest.charAt(0)){
            orderedRest = first + orderedRest;
        } else orderedRest = orderedRest + first;

        return orderedRest;
    }

    public static void main(String[] args) {

        System.out.println(orderCharGroups(""));
        System.out.println(orderCharGroups("1"));
        System.out.println(orderCharGroups("12"));
        System.out.println(orderCharGroups("1212"));
        System.out.println(orderCharGroups("abbaaababbaa"));
        System.out.println(orderCharGroups("ABBA"));
        System.out.println(orderCharGroups("11221122"));
        System.out.println(orderCharGroups("AAAAAA"));
        System.out.println();

    }
}
