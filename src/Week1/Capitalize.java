package Week1;

public class Capitalize {
    public static void main(String[] args) {
        System.out.println(capitalize("abracadabra"));
    }

    public static String[] capitalize(String s) {

        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            // int c =s.indexOf(s.charAt(i));
            if (i % 2 == 0) {
                s1 += s.toUpperCase().charAt(i);
            } else {
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
        String s2 = "";
        for (int j = 0; j < s.length(); j++) {
            int d = s.indexOf(s.charAt(j));
            if (j % 2 != 0) {
                s2 += s.toUpperCase().charAt(j);

            } else {
                s2 += s.charAt(j);
            }
        }
        System.out.println(s2);

        String[] result1 = new String[2];
        result1[0] = s1;
        result1[1] = s2;


        return result1;
    }
}
