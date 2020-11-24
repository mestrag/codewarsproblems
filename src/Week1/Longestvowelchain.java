package Week1;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Longestvowelchain {
    public static void main(String[] args) {
        String s = "ultrarevolutionariees";
        String[] vowelsTable = s.split("[^a,e,i,o,u]");
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < vowelsTable.length; i++) {
            String c = vowelsTable[i];
            hashMap.put(i, c);
        }


        System.out.println(hashMap.values());


        for (int j = 0; j < vowelsTable.length; j++) {
            System.out.println(vowelsTable[j]);
        }
    }


    public static int longvowel(String s) {
        ///  System.out.println(Arrays.stream((s.split("[^aeiou]"))).mapToInt(String::length).max().orElse(0));
        String[] vowelsTable = s.split("[^a,e,i,o,u]");
        for (int j = 0; j < vowelsTable.length; j++) {
            System.out.println(vowelsTable[j]);
        }

        String[] matcher = Pattern.compile("[aeiou]+").matcher(s)
                .results().map(MatchResult::group).toArray(String[]::new);
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < matcher.length; i++) {
            ls.add(matcher[i].length());
        }
        return Collections.max(ls);
    }
}


