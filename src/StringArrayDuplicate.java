import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringArrayDuplicate {
    public static void main(String[] args) {


       // Arrays.stream(strings).filter(i-> Collections.frequency(Arrays.asList(strings),i)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
    public static String[] dup(String[] strings) {

        Arrays.stream(strings).filter(i-> Collections.frequency(Arrays.asList(strings),i)>1).collect(Collectors.toSet()).forEach(System.out::println);

        return null;

    }
}
