package MiscProblems;

public class Simplefibonaccistrings {
    public static void main(String[] args) {
        System.out.println(solve(2));
    }

    public static String solve(int i) {
        if (i == 0) {
            return "0";
        }
        String f0 = "0", f1 = "01";
        String f2 = "";
        for (int j = 2; j <= i; j++) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }
}
