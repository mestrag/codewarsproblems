package Practise;

import java.util.HashMap;
import java.util.List;

public class Comparelist {
    public static void main(String[] args) {

    }


public static boolean compareList(List<String> l1, List<String> l2) {
    if (l1.size() != l2.size()) {
        return false;
    }
    HashMap<Integer, String> s = new HashMap<>();
    for (int i = 0; i < l1.size(); i++) {
        if (!s.containsKey(l1.get(i))) {

            s.put(i, l1.get(i));

        }
    }
    for (int i = 0; i < l2.size(); i++) {
        if (!s.containsKey(l2.get(i))) {

            s.put(i, l2.get(i));

        }
    }
    //compare 2 hashmaps
    return true;


}
}


