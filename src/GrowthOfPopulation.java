public class GrowthOfPopulation {
    public static void main(String[] args) {

        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        var v = p0 + p0 * (percent / 100) + aug;
        int count = 1;
        while (v < p) {
            v = v + v * (percent / 100) + aug;
            count++;
        }
        return count;
    }
}
