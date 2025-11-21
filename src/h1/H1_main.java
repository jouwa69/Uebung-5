package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {1,4,2,3,22,5,5,4,3,5,5,4,2};
        int[] myArray2 = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            myArray2[myArray.length - 1 - i] = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray2[i];
        }
        System.out.println("myArray = " + Arrays.toString(myArray));
    }
}
