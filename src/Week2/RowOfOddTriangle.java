package Week2;/*
Given a triangle of consecutive odd numbers:
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
find the triangle's row knowing its index (the rows are 1-indexed), e.g.:
odd_row(1)  ==  [1]
odd_row(2)  ==  [3, 5]
odd_row(3)  ==  [7, 9, 11]
 */

import java.util.Arrays;

public class RowOfOddTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(oddRow(3)));
    }


    public static long[] oddRow(int n) {
        long[] x = new long[n];
        ///to DO pending //////
        return x;
    }

}
