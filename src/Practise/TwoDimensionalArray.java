package Practise;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] L = new int[5][5];
        char c = 35;
        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L.length; j++) {
                if (i == j) {
                    L[i][j] = 1;
                } else {
                    L[i][j] = 0;
                }
            }
        }
        System.out.println(L[4][4]);
    }
}
