import java.util.*;

public class StacksBalancedParenthesis {

    public static void main (String args[]){
        String expression = "(a+b)*{c-d}";
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;

        for (int i=0; i<expression.length();i++){
            char ch = expression.charAt(i);

            if (ch =='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            
        }
    }
}