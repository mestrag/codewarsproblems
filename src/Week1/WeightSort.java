package Week1;

import java.util.Arrays;

public class WeightSort {
    public static String orderWeight(String s) {

        String[] splitString = s.split(" ");
        System.out.println(Arrays.asList(splitString));
        String[] newSpace = new String[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            int sum = 0;
            for (int j = i; j <= i; j++) {
                sum += Integer.parseInt(String.valueOf(splitString[i].charAt(j)));
            }
            newSpace[i] = String.valueOf(sum);
        }
        System.out.println(Arrays.asList(newSpace));
        return newSpace.toString();
    }
}
