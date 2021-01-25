package MiscProblems;

import java.util.regex.Matcher;

public class DigPow {
    public static void main(String[] args) {
        int n = 695;
        System.out.println(digPow(695, 2));

    }

    public static long digPow(int n, int p) {
        // your code
        int sum = 0;
        int temp = n;
        //count the digits in input number
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (temp > 0 && count > 0) {
            int m = temp % 10;
            sum = (int) (sum + (Math.pow(m, count)));
            temp = temp / 10;
            count--;
        }
        System.out.println(sum);

        return sum;
    }
}
