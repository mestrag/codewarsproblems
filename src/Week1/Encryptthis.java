package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Encryptthis {
    public static void main(String[] args) {

        System.out.println(encryptThis("Barry is"));
        String x = "103";
        System.out.println(Character.toString(Integer.parseInt(x)));

    }


    public static String encryptThis(String s) {

        if (s.length() == 0) {
            return "";
        }
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(s.split(" ")));
        // String[] a = s.split(" ");
        String newStr = "";
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() == 1) {
                int c = a.get(i).codePointAt(0);
                newStr += c + " ";
                System.out.println(newStr.trim());
            }

            if (a.get(i).length() == 2) {
                int c = a.get(i).codePointAt(0);
                newStr += c + a.get(i).substring(1) + " ";
                System.out.println(newStr.trim());
            }
            if (a.get(i).length() > 2) {
                int c = a.get(i).codePointAt(0);
                newStr += c + a.get(i).substring(a.get(i).length() - 1) + a.get(i).substring(2, a.get(i).length() - 1) + a.get(i).substring(1, 2) + " ";

            }
        }
        System.out.println(newStr.trim());
        return newStr.trim();

    }


}
