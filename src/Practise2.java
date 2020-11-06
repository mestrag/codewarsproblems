import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise2 {
    public static void main(String[] args) {
        int[] x = new int[]{30, 1, 43, 44, 11, 15, 32, 12, 39, 12, 24, 34, 3, 43, 18, 38, 22, 29, 37, 36, 10, 46, 34, 25, 9, 3, 20, 25, 24};

        List<Integer> newList = Arrays.asList(30, 1, 43, 44, 11, 15, 32, 12, 39, 12, 24, 34, 3, 43, 18, 38, 22, 29, 37, 36, 10, 46, 34, 25, 9, 3, 20, 25, 24);

        Map<Integer, Long> frequency = newList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Integer, Long> finalMap = new LinkedHashMap<>();

        frequency.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).
                forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);


        for (int i = 0; i < finalMap.keySet().size(); i++) {


        }
        String a = "12323";
        //convert this to a number
        //without double quote its a number
        System.out.println(Integer.parseInt(a));

        String w ="599600601602";
        int c=w.charAt(0);
               int len= w.length();
               StringBuffer bf= new StringBuffer();
        for (int i = c; i < len; i++){
            bf.append(c);

        }
        if(bf.equals(w)){

        }


    }
}
