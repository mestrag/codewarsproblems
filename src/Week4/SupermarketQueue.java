package Week4;

import java.util.*;

//Pending

public class SupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{10, 2, 3, 3}, 1));
    }

    public static int solveSuperMarketQueue(int[] ints, int i) {
        if (i == 1) {
            return Arrays.stream(ints).sum();
        }
        if (ints.length == 0) {
            return 0;
        }

        Queue<Integer> queue = new PriorityQueue<Integer>();

        return 0;
    }
}
