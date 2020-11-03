public class HalvingSum {
    public static void main(String[] args) {

        System.out.println(halfSum(25));
    }

    //25  =>  25 + 12 + 6 + 3 + 1 = 47
    public static int halfSum(int n) {
        int sum = n;
        for (int i = 2; i <= n / 2 * i; i = i * 2) {

            sum += n / i;
        }
        return sum;
    }
}
