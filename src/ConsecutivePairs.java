public class ConsecutivePairs {
    public static void main(String[] args) {

    }

    public static int pairSolution(int[] x) {
       int count = 0;

        for (int i = 0; i < x.length-1;i=i+2) {
            if (x[i] - x[i + 1] == 1 || x[i + 1] - x[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
