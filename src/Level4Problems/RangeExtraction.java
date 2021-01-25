package Level4Problems;

import java.util.ArrayList;
import java.util.List;

/*https://www.codewars.com/kata/51ba717bb08c1cd60f00002f*/
public class RangeExtraction {
    public static void main(String[] args) {

    }

    public static String rangeExtraction(int[] arr) {
        List<String> newlist = new ArrayList<>();
        int counter;
        for (int i = 0; i < arr.length; ) {
            counter = 0;
            String start = String.valueOf(arr[i]);
            while (i != arr.length - 1 && arr[i + 1] - arr[i] == 1) {
                ++counter;
                ++i;
            }
            if (counter > 0) {
                if (counter > 1) {
                    start += "-" + (Integer.parseInt(start) + counter);
                } else {
                    --i;
                }

            }
            newlist.add(start);
            ++i;
        }

        return String.join(",", newlist);
    }
}
