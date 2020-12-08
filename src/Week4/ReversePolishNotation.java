package Week4;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String expr = "5 1 2 + 4 * + 3 -";
        System.out.println(evaluate(expr));

    }

    public static double evaluate(String expr) {
        // TODO: Your awesome code here
        //  expr="5 1 2 + 4 * + 3 -";
        String[] tokens= expr.split(" ");
        if (expr.toCharArray().length == 0) {
            return 0;
        }
        Stack<Double> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.add(a - b);
            } else if (s.equals("*")) {

                stack.add(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                double b = stack.pop();
                double a = stack.pop();
                stack.add(a / b);
            } else {
                stack.add(Double.valueOf(s));
            }
        }
        return stack.pop();
    }
}
