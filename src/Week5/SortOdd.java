package Week5;

import java.util.Arrays;

///Pending
public class SortOdd {
    public static void main(String[] args) {
        System.out.println(sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    public static int[] sortArray(int[] array) {
        int[] n = new int[array.length];
        int great;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] % 2 != 0 && array[j] % 2 != 0) {
                    if (array[i] > array[j]) {
                        great = array[i];
                        array[i] = array[j];
                        array[j] = great;
                    }
                }
            }
            System.out.println(array[i]);
        }

        return array;
    }
}
