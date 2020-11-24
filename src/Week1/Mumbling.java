package Week1;

import java.util.Arrays;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        String after = "";

        for (int i = 0; i < s.length(); i++) {
            int position = s.indexOf(s.charAt(i), i);
            for (int j = i; j <= i; j++) {
                while (position >= 0) {
                    after += s.charAt(i);
                    position--;
                }
            }
            if (i < s.length() - 1) {
                after = after + "-";
            }
        }
        String[] arr = after.split("-");
        String updated = "";
        for (int j = 0; j <= arr.length - 1; j++) {
            String fin = "";
            if (arr[j].substring(0) == arr[j].substring(0).toUpperCase()) {
                fin = arr[j].substring(0, 1) + arr[j].substring(1).toLowerCase();
            } else {
                fin = arr[j].toUpperCase().substring(0, 1) + arr[j].substring(1).toLowerCase();
            }
            if (j < arr.length - 1) {
                fin = fin + "-";
            }
            // System.out.print(fin);
            updated += fin;

        }
        return updated;
    }

    public static String accum2(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
}