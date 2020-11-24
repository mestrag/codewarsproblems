package Week1;

public class Digitalroot {


    public static int digital_root(int n) {
        if (countDigit(n) == 1) {
            return n;
        }
        int sum = 0;
        while (countDigit(n) > 1) {
            for (sum = 0; n != 0; n = n / 10) {
                sum += n % 10;
            }
            n = sum;
        }
        return sum;
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

}
