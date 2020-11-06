import java.util.Arrays;
import java.util.Set;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        int prev = Integer.MAX_VALUE;

        for (Integer current : array) {
            if (prev != Integer.MAX_VALUE && (current != prev + 1)) {
                return current;
            }
            prev = current;
        }
        if (prev == array[array.length - 1]) {
            return null;
        }
        return prev;
    }
}
