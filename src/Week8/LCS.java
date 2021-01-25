package Week8;

public class LCS {
    public static String lcsMatrix(String x, String y) {
        // LCS Matrix
        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();
        int n = s1.length;
        int m = s2.length;
        int[][] L = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (s1[i] == s2[k]) {
                    L[i + 1][k + 1] = 1 + L[i][k];
                } else {
                    L[i + 1][k + 1] = Math.max(L[i][k + 1], L[i + 1][k]);
                }
            }
        }
        // LCS Matrix traversal to find the required Subsequence
        int j = x.length();
        int k = y.length();
        StringBuilder sb = new StringBuilder();
        while (L[j][k] > 0) {
            if (s1[j - 1] == s2[k - 1]) {
                sb.append(s1[j - 1]);
                j--;
                k--;
            } else if (L[j - 1][k] > L[j][k - 1]) {
                j--;

            } else {
                k--;
            }
        }
        return sb.reverse().toString();

    }


}
