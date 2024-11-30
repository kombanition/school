/*
    Aufgabe 2) Eindimensionale Arrays
*/
import java.util.Arrays;

public class Aufgabe2 {

    public static void main(String[] args) {
        // Aufgabe a)
        short sArr[] = new short[]{3, 6, 24, 31, 35, 44, 67, 73, 89, 92};
        for(int i = 0; i < sArr.length; i++){
            if(i == 0){
                System.out.print("|" + sArr[i]);
            } else if(i == sArr.length - 1){
                System.out.print(sArr[i] + "|");
            } else {
                System.out.print(sArr[i] + ";");
            }
        }
        // Aufgabe b)

        char cArr[] = new char[]{'a', '8', '8', 'G', '2', ':', ':', ':', 'F', '7', 'b', 'b', '-', 'T'};
        int extraArraySpace = 0;
        for(int i = 0; i < cArr.length - 1; i++){
            if(cArr[i] == cArr[i + 1]){
                extraArraySpace++;
            }
        }
        char cArrNew[] = new char[cArr.length + extraArraySpace];
        int cArrNewIndex = 0;

        for(int i = 0; i < cArr.length; i++){
            if(i == cArr.length - 1){
                cArrNew[cArrNewIndex] = cArr[i];
            } else if(cArr[i] == cArr[i + 1]){
                cArrNew[cArrNewIndex++] = cArr[i];
                cArrNew[cArrNewIndex++] = '+';
            } else{
                cArrNew[cArrNewIndex++] = cArr[i];
            }
        }
        System.out.println();
        for(char i : cArrNew){
            System.out.print(i);
            System.out.print(" ");
        }
        // Aufgabe c)

        int iArr[] = new int[20];

        for(int i = 0; i < iArr.length; i++){
            iArr[i]= 19 - i;
        }
        System.out.println();
        for(int i = iArr.length - 1; i >= 0; i--){
            if(i == 0) {
                System.out.print(iArr[i]);
            } else {
                System.out.print(iArr[i] + "!");
            }
        }
        System.out.println();
        int i = iArr.length - 1;
        while(i >= 0){
            if(i == 0) {
                System.out.print(iArr[i]);
            } else {
                System.out.print(iArr[i] + "!");
            }
            i--;
        }
    }
}

