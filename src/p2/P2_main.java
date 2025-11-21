package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 4, 30, 2};
        int max = 100, minIndex = 2;

        max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for  (int i = 0; numbers[i]<max; i++) {
            minIndex = i;
        }
        System.out.println("max = " + max + "; minIndex = " + minIndex);

    }
}




