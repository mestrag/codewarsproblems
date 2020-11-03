import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class findOccurrence {
    public static void main(String[] args) {
        String string = "This is an example. Return the nth occurrence of example in this example string.";
        System.out.println(Occurence("example", string, 1));
    }

    static int Occurence(String subStr, String str, int occurence) {
        if (subStr.length() == 0 || str.length() == 0) {
            return 0;
        }

        int index = 0;
        int count = 0;
     //   Map<Integer,Integer> map = new Map<Integer, Integer>();

        while (true) {
            index = str.indexOf(subStr, count);
            System.out.println(str.indent(index));
            count += subStr.length();
        }

    }


}

