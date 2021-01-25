package Week6;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int count = 0;
        int str2len = str2.length();
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }

        }
        return count == str2len;
    }
}
