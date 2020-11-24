package Week1;

/*
i) If a=0 or b=0, return [a,b]. Otherwise, go to step (ii);
ii) If a≥2*b, set a = a-2*b, and repeat step (i). Otherwise, go to step (iii);
iii) If b≥2*a, set b = b-2*a, and repeat step (i). Otherwise, return [a,b].
 */

import java.util.Arrays;

public class Recursion101 {
    public static void main(String[] args) {
        System.out.println(solve(6, 19));
    }

    public static int[] solve(int a, int b) {
        int[] x = new int[2];
        if (a == 0 || b == 0) {
            int[] y;

        } else if (a >= 2 * b) {
            a = a - 2 * b;
            System.out.println(a);
            return x;
        } else if (b >= 2 * a) {
            b = b - 2 * a;
            System.out.println(b);
            return x;
        }

        return null;
    }
}
