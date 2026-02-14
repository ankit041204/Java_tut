import java.util.Stack;

public class StackValidparenthesis {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                if ((stack.peek() == '(' && ch == ')') ||
                    (stack.peek() == '{' && ch == '}') ||
                    (stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";

        if (isValid(str)) {
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Invalid Parenthesis");
        }
    }
}
