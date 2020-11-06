import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DecipherThis {
    public static void main(String[] args) {

        decipher2("72eva 97 103o 97t 116sih 97dn 115ee 104wo 121uo 100o");
    }

    public static String decipher2(String s) {

        if (s.length() == 0) {
            return "";
        }
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(s.split(" ")));
        for (int j = 0; j < a.size(); j++) {

            Matcher mc = Pattern.compile("\\d+").matcher(a.get(j));

            while (mc.matches()) {
                mc.replaceAll(String.valueOf(Character.toChars(Integer.parseInt(mc.group()))));
            }

        }
        System.out.println(a.toString());


       /* String z = "";
        String newStr = "";
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() == 1) {
                String c = Character.toString(a.get(i).charAt(0));
                newStr += c + " ";
                System.out.println(newStr.trim());
            }

            if (a.get(i).length() == 2) {
                String c = Character.toString(a.get(i).charAt(0));
                newStr += c + a.get(i).substring(1) + " ";
                System.out.println(newStr.trim());
            }
            if (a.get(i).length() > 2) {

                String c = Character.toString(a.get(i).charAt(0));
                newStr += c + a.get(i).substring(a.get(i).length() - 1) + a.get(i).substring(2, a.get(i).length() - 1) + a.get(i).substring(1, 2) + " ";

            }
        }
        System.out.println(newStr.trim());
        return newStr.trim();*/
        return null;

    }

    /*public static String decipher(String text) {
        return Arrays.stream(text.split(" "))
                .map(w -> w.length() > 2 ? String.valueOf(w) + w.substring(w.length() - 1)
                        + w.substring(2, w.length() - 1) + w.substring(1, 2) :
                        w.length() > 1 ? Character.toString(Integer.parseInt(w)) + w.substring(1) :
                                w.length() == 1 ? Character.toString(Integer.parseInt(w)) + "" : "")
                .collect(Collectors.joining(" "));
    }*/
}
