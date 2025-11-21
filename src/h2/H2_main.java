package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 1199999, digits = 10;
        int[] a = new int[9];
        digits = 1;
        int nOriginal = n;
        if (n < 0) {
            n = n * -1;
        }
        if (n < 10) digits = 1;
        else digits = ++digits;
        while (n / 10 > 9) {
            digits = ++digits;
            n = n / 10;
        }
        n = nOriginal;
        for  (int i = 0; n>0; i++) {
            a[a.length - 1 - i] = n % 10;
            n = n / 10;
        }
        n = nOriginal;
        System.out.println("n = " + n + " hat " + digits + " digits");
        System.out.println(Arrays.toString(a));
    }
}
