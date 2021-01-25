package Practise;

public class BruteForce {
    public static void main(String[] args) {
        System.out.println(findBrute(new char[]{'d','t', 'e', 'x', 't'}, new char[]{'t', 'e', 'x', 't'}));

    }

    public static int findBrute(char[] text, char[] pattern) {
        int n = text.length;
        int m = pattern.length;
        for (int i = 0; i < n ; i++) {
            int k = 0;
            while (k < m && text[i + k] == pattern[k]) {
                k++;
                if (k == m) {
                    return i;
                }
            }
        }
        return -1;
    }
}
