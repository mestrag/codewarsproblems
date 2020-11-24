package Week3;

import java.util.List;

public class SimpleConsecutivePair {


    public static int solve(int[] arr) {
        int pair = 0;
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff == 1) {
                pair++;
            }
        }
        return pair;
    }
}
