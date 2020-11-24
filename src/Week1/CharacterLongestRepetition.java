package Week1;

import java.util.HashMap;
import java.util.Map;

public class CharacterLongestRepetition {
    public static void main(String[] args) {
        String s = "abcddd";
        Map<Character, Integer> mp = new HashMap<>();
        if (s.length() == 0) {
            mp.put(' ', 0);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer ctr = mp.get(ch);
            if (ctr != null) {
                mp.put(ch, ctr + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        System.out.println(mp);
    }

    public static Object[] longestRepetition(String s) {
        Object[] obj = new Object[2];

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer ctr = mp.get(ch);
            if (ctr != null) {
                mp.put(ch, ctr + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        obj.getClass();


        return obj;
    }
}
