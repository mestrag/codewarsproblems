import java.util.*;
import java.util.stream.IntStream;

////output -->number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
public class LineNumbering {
    public static void main(String[] args) {

        System.out.println(number(Arrays.asList("", "", "")));

    }

    public static List<String> number(List<String> lines) {
        List list1 = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            list1.add(i + 1 + ": " + lines.get(i));
        }
        return list1;
    }
}
