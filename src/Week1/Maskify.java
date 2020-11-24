package Week1;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("ram"));
    }

    public static String maskify(String str) {
        int l = str.length();
        if (l == 1 || l <= 4) {
            return str;
        } else if (l == 0) {
            return "";
        }

        StringBuffer bf = new StringBuffer();
        if (l >= 4) {
            String str1 = str.substring(0, str.length() - 4);
            for (int j = 0; j < str1.length(); j++) {
                bf.append("#");
            }
        }
        return bf.toString() + str.substring(str.length() - 4);
    }
}
