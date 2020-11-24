package Week3;

import java.util.LinkedList;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
    }

    public static int josephusSurvivor(final int n, final int k) {
        if (n == 1) {
            return 1;
        } else {
            return (k - 1 + josephusSurvivor(n - 1, k)) % n + 1;
        }
    }
}
