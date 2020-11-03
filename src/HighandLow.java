import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighandLow {
    public static void main(String[] args) {

    }

    public static String highAndLow(String s) {
        String[] s1 = s.split(" ");
        String max = Arrays.stream(s1).max(Comparator.comparing(Integer::valueOf)).get();
        String min = Arrays.stream(s1).min(Comparator.comparing(Integer::valueOf)).get();
        return max + " " + min;
    }
}

