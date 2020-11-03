import java.util.ArrayList;

public class StringReversal {
    public static void main(String[] args) {

        System.out.println(solve("srawedoc"));
    }

    public static String solve(String s){
        // Find the position of spaces in the initial String
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                arr.add(j);

            }
        }
       //Reverse the given String without Spaces
       char[] str = s.toCharArray();
        StringBuffer bf = new StringBuffer();
        for (int i = str.length - 1; i >= 0; i--) {
            if ((str[i] != ' ') && (str[i] != '\t')) {
                bf.append(str[i]);
            }
        }
       //Insert the required spaces from the Original given String
        for (int k = 0; k < arr.size(); k++) {
            bf.insert(arr.get(k), " ");
        }
        return bf.toString();
    }

}










