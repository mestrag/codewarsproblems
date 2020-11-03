import java.util.*;

public class SimpleFrequencySort {

    public static void main(String[] args) {

    }
    public static int[] sortByFrequency(int[] s) {
       // System.out.println(Arrays.toString(s));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            int x = s[i];
            Integer m = map.get(x);
            if (m != null) {
                map.put(x, m + 1);
            } else {
                map.put(x, 1);
            }
        }



        Map<Integer,Integer> mp = new TreeMap<>(map);
        System.out.println(mp);

        ArrayList<Map.Entry<Integer, Integer>> mapEntry = new ArrayList<>(map.entrySet());
        Collections.sort(mapEntry, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });




        ArrayList<Integer> k = new ArrayList<>();
        for (int i = 0; i < mapEntry.size(); i++) {
            int frequency = mapEntry.get(i).getValue();

            while (frequency >= 1) {
                k.add(mapEntry.get(i).getKey());
                frequency--;
            }
        }
        int[] arr = new int[s.length];
        for (int m = 0; m < k.size(); m++) {
            arr[m] = k.get(m);
        }
        return arr;

    }
}
