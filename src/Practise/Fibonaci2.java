package Practise;

import java.math.BigInteger;

public class Fibonaci2 {
    public static void main(String[] args) {
        System.out.println(fib(1000000009));
    }


    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        if (n == 0) {
            return 0;
        }

          for (int i = 2; i <= n; i++) {
            c = a+b;
            a = b;
            b = c;


        }
      return b%10;
    }
}
