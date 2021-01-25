package Practise;

import java.math.BigInteger;
import java.util.HashMap;

public class FibonaciCountRecurrence {
    public static void main(String[] args) {
        System.out.println(FibDigits(193150));
    }
    public static int[][] FibDigits(int n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);

        if (n == 0) {
            return new int[][]{new int[]{0, 0}};
        }
        long start = System.currentTimeMillis();
        for (int i = 2; i < n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        long end = System.currentTimeMillis();
        HashMap<BigInteger, Integer> m = new HashMap<>();

        while (n != 0) {
            BigInteger sourced = b.remainder(BigInteger.valueOf(10));
            if (m.containsKey(sourced)) {
                m.put(sourced, m.get(sourced) + 1);
            } else {
                m.put(sourced, 1);
            }
            n = n / 10;
        }
        BigInteger ans = b.remainder(BigInteger.valueOf(10));
        System.out.println("Time taken is---> " + (end - start));
        System.out.println(ans.intValue());
      //  System.out.println(b);
     //   m.forEach((k, v) -> System.out.println(k + "," + v));
        return null;
    }


}
