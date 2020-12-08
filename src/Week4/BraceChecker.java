package Week4;

import java.util.LinkedList;
import java.util.Stack;

public class BraceChecker {
    public boolean isValid(String braces) {
        // Add code here
        String opening = "([{";
        String closing = ")]}";
        Stack<Character> stack= new Stack<Character>();
        for (char c :braces.toCharArray()){
            if(opening.indexOf(c)!=-1){
                stack.push(c);
            }
            else if(closing.indexOf(c)!=-1){
                if(stack.isEmpty()){
                    return false;
                }
                if(closing.indexOf(c)!=opening.indexOf(stack.pop())){
                    return false;
                }
            }
        }
return stack.isEmpty();
    }
}
