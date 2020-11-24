package Week3;
/*
In this Kata, you will be given an array of strings and your task is to
remove all consecutive duplicate letters from each string in the array.
For example:
dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
dup(["kelless","keenness"]) = ["keles","kenes"].
Strings will be lowercase only, no spaces.
 */

import java.util.Arrays;

public class StringArrayDuplication {

    public static String[] dup(String[] arr) {

        String[] x = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {

            char s[] = arr[i].toCharArray();
            int n = s.length;
            int m = 0;
            for (int j = 1; j < n; j++) {
                if (s[m] != s[j]) {
                    m++;
                    s[m] = s[j];
                }
            }
            x[i] = String.valueOf(Arrays.copyOfRange(s, 0, m + 1));
        }

        return x;
    }
}
