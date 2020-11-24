package Week1;/*Basic Sequence Practice-->
A sequence or a series, in mathematics, is a string of objects, like numbers, that follow a particular pattern.
The individual elements in a sequence are called terms. A simple example is 3, 6, 9, 12, 15, 18, 21, ...,
where the pattern is: "add 3 to the previous term".
In this kata, we will be using a more complicated sequence: 0, 1, 3, 6, 10, 15, 21, 28, ...
This sequence is generated with the pattern: "the nth term is the sum of numbers from 0 to n, inclusive".
[ 0,  1,    3,      6,   ..10,15.]
  0  0+1  0+1+2  0+1+2+3
 */

import java.util.Arrays;

public class SequenceSum {
    public static void main(String[] args) {
    }

    public static int[] sumOfN(int n) {
        int[] x = new int[Math.abs(n) + 1];
        int sign = (int) Math.signum(n);
        for (int i = 0; i < x.length; i++) {
            x[i] = sign * (i * (i + 1) / 2);
            System.out.println(x[i]);
        }

        System.out.println(Arrays.toString(x));
        return x;
    }

}
