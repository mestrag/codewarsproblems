public class CountTheDigit {
    public static void main(String[] args) {
        nbDig(11011, 2);
        //  sqaureOfNum(5);
    }

    static int nbDig(int n, int d) {
        StringBuilder bf = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            bf.append(i * i);
        }
        int count = 0;
        String x = Integer.toString(d);
        for (int j = 0; j < bf.length(); j++) {
            if (bf.charAt(j) == x.charAt(0)) {
                count++;
            }
        }
        return count;
    }

    /*static int[] sqaureOfNum(int x){
        int [] arr = new int[x];
        for(int i=0;i<=x;i++){
            System.out.println(i*i);

        }
        return arr;
    }*/
}
