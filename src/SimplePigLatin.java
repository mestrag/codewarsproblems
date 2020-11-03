import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public class SimplePigLatin {
    public static String pigIt(String str) {
        System.out.println(str);
        if (str.length() == 0) {
            return null;
        }
        String[] str4 = str.split(" ");
        String[] str5 = new String[str4.length];

        for (int i = 0; i < str4.length; i++) {
            String str1 = "";
            String str2 = "";
            if(!Pattern.compile("[!@#$%&*()_+=|<>?{}:/\n\"\\[\\]~-]").matcher(str4[i]).find()) {
                for (int j = i; j <= i; j++) {
                    str1 = str4[i].substring(0, 1);
                    str2 = str4[i].substring(1, str4[i].length());

                }
                str5[i] = str2 + str1 + "ay";
            } else
            {str5[i]=str4[i];}

        }

        return String.join(" ", str5);
    }
}
