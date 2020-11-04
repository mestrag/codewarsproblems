import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mostFrequentItemCount {
    public static void main(String[] args) {
    }

    public static int mostFrequentItemCount(int[] collection) {

        if (collection.length == 0) {
            return 0;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < collection.length; i++) {
            int key = collection[i];
            if (countMap.containsKey(key)) {
                int count = countMap.get(key);
                count++;
                countMap.put(key, count);
            } else {
                countMap.put(key, 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

            if (maxEntry == null
                    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getValue();
    }
}
