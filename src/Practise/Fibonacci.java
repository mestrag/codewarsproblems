package Practise;

/*As you probably know, Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8, 13...
 Write a method that takes the index as an argument and returns last digit from fibonacci number.
 Example: getLastDigit(15) - 610. Your method must return 0 because the last digit of 610 is 0.
 Fibonacci sequence grows very fast and value can take very big numbers (bigger than integer type can contain),
 so, please, be careful with overflow.
  */

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1000000009));

    }

    public static int fib(int n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);

        if (n == 0) {
            return 0;
        }
        ;

        long start = System.currentTimeMillis();
        for (int i = 2; i < n; i++) {
            c = a.add(b);
            a = b;
            b = c;

        }
        long end = System.currentTimeMillis();

        BigInteger ans = b.remainder(BigInteger.valueOf(10));
        System.out.println("Time taken is---> " + (end - start));

        return ans.intValue();
    }

    public static long fib2(int n) {
        return Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[1] + i[1]})
                .limit(n)
                .reduce((x, y) -> y)
                .get()[0]%10;
    }

}
