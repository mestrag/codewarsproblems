package MiscProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        if (words.length() == 0) {
            return "";
        }

        String[] s = words.split(" ");
        HashMap<Integer, String> h = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            int x = Integer.parseInt(s[i].replaceAll("[^0-9]+", " ").trim());
            h.put(x, s[i].replaceAll("", ""));
        }
        ArrayList l = new ArrayList<String>();
        for (Map.Entry<Integer, String> i : h.entrySet()) {
            l.add(i.getValue());
        }
        return (String) l.stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}




