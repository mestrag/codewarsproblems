public class MatrixAddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {

        int[][] result = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                result[i][j]=a[i][j]+b[i][j];
            }
        }

        return result;
    }
}
