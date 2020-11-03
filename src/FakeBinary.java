import java.util.ArrayList;

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("-9"));
    }
    /*replace below 5 with zeros
     * replace above 5 with one
     * */

    public static String fakeBin(String str) {

        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(String.valueOf(str.charAt(i))) >= 5) {
                bf.append(1);
            } else {
                bf.append(0);
            }
        }
        return bf.toString();
    }
}
