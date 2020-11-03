import java.util.Stack;

public class BackSpaceInString {

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }
    public static String cleanString(String s) {


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (c != '#') {
                stack.push(c);
                System.out.println(stack);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }
        String ans = "";
        while (!stack.empty()) {
            ans += stack.pop();
        }
        String newans = "";

        for (int j = ans.length() - 1; j >= 0; j--) {
            newans += ans.charAt(j);
        }
        return newans;
    }
}
