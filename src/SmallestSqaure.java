import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SmallestSqaure {
    public static long solve(int n){
        //...
        ArrayList<Integer> num= new ArrayList<>();

        for(int i=0;i<n;i++){
           num.add(i,i*i);
        }
        System.out.println(num.get(2));
        return 0L;
    }
}
