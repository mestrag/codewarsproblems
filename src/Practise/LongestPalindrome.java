package Practise;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(IsPalindrome("racecarw"));

    }

    static Boolean IsPalindrome(String s) {
        if (s.length() == 0) {
            return null;
        }
        if (s.length() == 1) {
            return true;
        }
        int i = 0, j = s.length()-1;
        while (i < j ) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }
}


