/*https://www.codewars.com/kata/5254ca2719453dcc0b00027d*/
package Level4Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        List<String> result = new ArrayList<>();
        permutate(0, new StringBuilder(s), result);
        return result.stream().distinct().collect(Collectors.toList());
    }

    //permutate the string each character
    private static void permutate(int l, StringBuilder sb, List<String> result) {
        if (l == sb.length()) {
            result.add(sb.toString());
        } else {
            for (int i = l; i < sb.length(); i++) {
                swap(sb, i, l);
                permutate(l + 1, new StringBuilder(sb), result);
                swap(sb, i, l);
            }
        }
    }

    //swap the characters
    private static void swap(StringBuilder sb, int i, int j) {
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }
}
