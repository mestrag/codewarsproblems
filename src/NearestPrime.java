import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class NearestPrime {


    public static void main(String[] args) {

        System.out.println(solve(11L));
    }

    public static long solve(long n) {

        int diff1, diff2 = 0;
        int num1, num2 = 0;
/*
        for(Long i =n;;i++){
            if(isPrime((int) n)){
                diff1= (int) (i-n);
                num1= Math.toIntExact(i);
                break;
            }
        }*/

        for (Long j = n; ; j--) {
            if (isPrime((int) n)) {
                diff2 = (int) (n - j);
                num2 = Math.toIntExact(j);
                break;
            }
        }
      /*  if(diff1<diff2){
            return num1;
        }
        else if (diff2<diff1) {
         return num2;
        }*/
        return num2;


       /* for (int j = store.size()-1; j >0; j--) {
            if (n - store.get(j) <min) {
                min = (int) (n - store.get(j));
                z = store.get(j);
                System.out.println(z);
            }
        }*//*
        for(int j=store.size()-1;j>0;j--){
            if((isPrime(store.get(j)))){
                z= store.get(j);

            }
            break;

        }
*/
    }

    public static boolean isPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);

        return b.isProbablePrime(1);
    }


}
