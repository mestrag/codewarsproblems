package Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInString {
    public static void main(String[] args) {

    }

    public static int solveNumbers(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        Pattern pt = Pattern.compile("(\\-?\\d+)");
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            result.add(Integer.valueOf(mt.group()));
        }
        return Collections.max(result);
    }
}
