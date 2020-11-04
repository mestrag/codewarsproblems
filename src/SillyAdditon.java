import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SillyAdditon {
    public static void main(String[] args) {
        //System.out.println(add(12, 23));
        int a = 12;
        int b = 1321;
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> ch1 = new ArrayList<>();
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        for (int i = 0; i < c.length(); i++) {
            ch.add(c.charAt(i));
        }
        for (int j = 0; j < d.length(); j++) {
            ch1.add(d.charAt(j));
        }
        System.out.println(ch.toString());
        System.out.println(ch1.toString());
        int[] sum = new int[ch1.size()];

        if (ch.size() > ch1.size()) {
            System.out.println("test");
        } else if (ch1.size() > ch.size()) {
            for (int k = ch1.size() - 1; k <= 0; k--) {
                for (int l = 0; l < ch.size(); l--) {
                    System.out.println(ch1.get(k));
                    sum[k] = ch1.get(k) + ch.get(l);
                    System.out.println(sum);
                }

            }
        }

    }

    public static int add(int num1, int num2) {

        BigInteger n1 = new BigInteger(String.valueOf(num1));
        BigInteger n2 = new BigInteger(String.valueOf(num2));

        BigInteger sum = n1.add(n2);

        return sum.intValue();

    }


}
